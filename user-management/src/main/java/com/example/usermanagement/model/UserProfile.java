package com.example.usermanagement.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "user_profile_table")
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 255, nullable = false)
    private String name;

    @Column(length = 255, nullable = false)
    private String address;

    @Column(length = 255, nullable = false)
    private String email;

    @Column(name = "phone_number",length = 10, nullable = false)
    private Integer phone;

    @Column(name = "user_id")
    private Integer userId;

//    private List<User> users;

    public UserProfile(){}

    public UserProfile(Long id, String name, String address, String email, Integer phone, Integer userId) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.userId = userId;
    }

    public Long getId(){
        return id;
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail(){
        return email;
    }

    public Integer getPhone() {
        return phone;
    }

    public Integer getUserId(){
        return userId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "{"+
                    "id =" + id + ", name =" + name + ", address =" + address + ", phone =" + phone + ", email =" + email + ", phone =" + phone
                +"}";
    }

}
