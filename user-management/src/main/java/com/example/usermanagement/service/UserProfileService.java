package com.example.usermanagement.service;

import com.example.usermanagement.dto.User;
import com.example.usermanagement.dto.UserProfileResponse;
import com.example.usermanagement.model.UserProfile;
import com.example.usermanagement.repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class UserProfileService {
    private final UserProfileRepository userProfileRepository;
    private final RestTemplate restTemplate;

    @Autowired
    public UserProfileService(UserProfileRepository userProfileRepository, RestTemplate restTemplate) {
        this.userProfileRepository = userProfileRepository;
        this.restTemplate = restTemplate;
    }

    public ResponseEntity<?> findUsrs(){
        List<UserProfile> users = userProfileRepository.findAll();
        if(!users.isEmpty()){
            return new ResponseEntity<List<UserProfile>>(users, HttpStatus.OK);
        }else{
            return new ResponseEntity<>("No users found", HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<?> findUsersById(Long id){
        Optional<UserProfile> userProfile = userProfileRepository.findById(id);
        if (userProfile.isPresent()){
            User user = restTemplate.getForObject("http://authentication-service/user/" + userProfile.get().getUserId(), User.class);
            UserProfileResponse userProfileResponse = new UserProfileResponse(
                    userProfile.get().getId(),
                    userProfile.get().getName(),
                    userProfile.get().getAddress(),
                    userProfile.get().getEmail(),
                    userProfile.get().getPhone(),
                    user
            );
            return new ResponseEntity<>(userProfileResponse, HttpStatus.OK);
        }else {
            return new ResponseEntity<>("No User Found", HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<?> createUserProfile(UserProfile userProfile){
        try {
            return new ResponseEntity<UserProfile>(userProfileRepository.save(userProfile), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
