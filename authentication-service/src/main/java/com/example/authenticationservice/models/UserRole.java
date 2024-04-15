package com.example.authenticationservice.models;

import jakarta.persistence.*;

@Table(name = "\"user-role-mapping-table\"")
@Entity
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_role_id")
    private Long id;

//    @Column(name = "user_id")
    @JoinColumn(name = "user_id")
    @ManyToOne
    private User user_id;

//    @Column(name = "role_id")
    @JoinColumn(name = "role_id")
    @ManyToOne
    private Role role_id;

//    constructor
    public UserRole(){}

    public UserRole(Long id, User user_id, Role role_id){
        this.id = id;
        this.user_id = user_id;
        this.role_id = role_id;
    }

//    getter
    public Long getId(){
        return id;
    }
    public User getUserId(){
        return user_id;
    }

    public Role getRoleId(){
        return role_id;
    }

//    setter
    public void setId(Long id){
        this.id = id;
    }
    public void setUserId(User user_id){
        this.user_id = user_id;
    }

    public void setRoleId(Role role_id){
        this.role_id = role_id;
    }

    @Override
    public String toString(){
        return "id" + id + ", user_id" + user_id + ", role_id" + role_id;
    }

}
