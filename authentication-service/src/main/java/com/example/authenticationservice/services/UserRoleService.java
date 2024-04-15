package com.example.authenticationservice.services;

import com.example.authenticationservice.models.Role;
import com.example.authenticationservice.models.User;
import com.example.authenticationservice.models.UserRole;
import com.example.authenticationservice.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserRoleService {
    private UserRoleRepository userRoleRepository;

    @Autowired
    public UserRoleService(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    public List<UserRole> getAllUserRoles(){
        return userRoleRepository.findAll();
    }

    public Optional<UserRole> getUserRoleId(Long id){
        return userRoleRepository.findById(id);
    }

    public UserRole createUserRole(UserRole userRole){
        return userRoleRepository.save(userRole);
    }

    public UserRole updateUserRole(Long id, UserRole userRole){
        if(userRoleRepository.existsById(id)){
            userRole.setId(id);
            return userRoleRepository.save(userRole);
        }else {
            throw new RuntimeException("UserRole not found for id " + id);
        }
    }

    public void removeUserRole(Long id) {
        if(userRoleRepository.existsById(id)){
            userRoleRepository.deleteById(id);
        }else{
            throw new RuntimeException("UserRole not found for id " + id);
        }
    }
}
