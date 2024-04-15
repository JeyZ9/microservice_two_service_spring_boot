package com.example.usermanagement.dto;

public class User {
    private Long id;
    private String name;
    private String email;
    private String password;
    private boolean verificationStatus;

//    constructor

    public User() {}

    public User(Long id, String name, String email, String password, boolean verificationStatus) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.verificationStatus = verificationStatus;
    }


//    getter

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    public boolean getVerificationStatus(){
        return verificationStatus;
    }

//    setter

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setVerificationStatus(boolean verificationStatus){
        this.verificationStatus = verificationStatus;
    }
}
