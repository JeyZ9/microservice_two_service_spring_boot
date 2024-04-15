package com.example.authenticationservice.models;

import jakarta.persistence.*;

@Table(name = "\"role_table\"")
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long id;

    @Column(name = "role_name", nullable = false, length = 255)
    private String name;

    @Column(name = "description", nullable = false, length = 255)
    private String description;

//    constructor
    public Role(){}
    public Role(Long id, String name, String description){
        this.id = id;
        this.name = name;
        this.description = description;
    }

//    getter
    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }

//    setter
    public void setId(Long id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }

    @Override
    public String toString(){
        return "Id: " + id + ", Name: " + name + ", description" + description;
    }

}
