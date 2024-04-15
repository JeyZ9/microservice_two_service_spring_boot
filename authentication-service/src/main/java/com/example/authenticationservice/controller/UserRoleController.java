package com.example.authenticationservice.controller;

import com.example.authenticationservice.models.UserRole;
import com.example.authenticationservice.services.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/userrole")
public class UserRoleController {
    @Autowired
    private UserRoleService userRoleService;

    @GetMapping
    public List<UserRole> getUserRoles() {
        return userRoleService.getAllUserRoles();
    }

    @GetMapping("/{id}")
    public Optional<UserRole> getUserRoleById(@PathVariable Long id){
        return userRoleService.getUserRoleId(id);
    }

    @PostMapping
    public UserRole createUserRole(@RequestBody UserRole userRole){
        return userRoleService.createUserRole(userRole);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserRole> updateUserRole(@PathVariable Long id, @RequestBody UserRole userRole){
        UserRole updateUserRole = userRoleService.updateUserRole(id, userRole);
        return new  ResponseEntity<>(updateUserRole, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserRole(@PathVariable Long id){
        userRoleService.removeUserRole(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
