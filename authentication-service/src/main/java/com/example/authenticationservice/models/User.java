package com.example.authenticationservice.models;


import jakarta.persistence.*;

@Entity
@Table(name = "users_table")
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "user_id")
    private Long id;

    @Column(name = "user_name", length = 255)
    private String name;

    @Column(name = "email", length = 255)
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "verification_status")
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

    // Equals and hashCode methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return id != null ? id.equals(user.id) : user.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

//    toString method
    @Override
    public String toString() {
        return "{" + "id" + id + "\n" +
                "name" + name + "\n" +
                "email" + email + "\n" +
                "password" + password + "\n" +
                "verification" + verificationStatus + "\n" +
                "}";
    }
}

