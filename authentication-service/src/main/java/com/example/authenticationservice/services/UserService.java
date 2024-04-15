package com.example.authenticationservice.services;

import com.example.authenticationservice.models.User;
import com.example.authenticationservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> getUserAll(){
        return userRepository.findAll();
    }

    public Optional<User> getUserId(Long id){
        return userRepository.findById(id);
    }

    public User createUser(User user){
        return userRepository.save(user);
    }

    public User updateUser(Long id, User user){
        if (userRepository.existsById(id)){
            user.setId(id);
            return userRepository.save(user);
        }else{
            throw new RuntimeException("User already exists");
        }
    }

    public void deleteUser(Long id){
        if (userRepository.existsById(id)){
            userRepository.deleteById(id);
        }else{
            throw new RuntimeException("User already exists");
        }
    }
}
