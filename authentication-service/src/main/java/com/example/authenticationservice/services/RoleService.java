package com.example.authenticationservice.services;

import com.example.authenticationservice.models.Role;
import com.example.authenticationservice.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class RoleService {
    private RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public List<Role> getAllRoles(){
        return roleRepository.findAll();
    }

    public Optional<Role> getRoleById(Long id){
        return roleRepository.findById(id);
    }

    public Role createRole(Role role){
        return roleRepository.save(role);
    }

    public Role updateRole(Long id, Role role){
        if(roleRepository.existsById(id)){
            role.setId(id);
            return roleRepository.save(role);
        }else{
            throw new RuntimeException("Role not found for id " + id);
        }
    }

    public void removeRole(Long id){
        if (roleRepository.existsById(id)){
            roleRepository.deleteById(id);
        }else{
            throw new RuntimeException("Role not found for id " + id);
        }
    }
}
