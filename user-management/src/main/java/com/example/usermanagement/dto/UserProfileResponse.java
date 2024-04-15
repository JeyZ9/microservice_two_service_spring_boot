package com.example.usermanagement.dto;

public class UserProfileResponse {
    private Long id;
    private String name;
    private String address;
    private String email;
    private Integer phone;
    private User user;

//    private List<User> users;

    public UserProfileResponse(){}

    public UserProfileResponse(Long id, String name, String address, String email, Integer phone, User user) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.user = user;
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

    public User getUser(){
        return user;
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

    public void setUser(User user) {
        this.user = user;
    }
}
