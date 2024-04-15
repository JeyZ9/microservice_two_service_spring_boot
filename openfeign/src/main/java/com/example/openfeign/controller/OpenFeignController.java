package com.example.openfeign.controller;

import com.example.openfeign.common.internal.InternalServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenFeignController {
    private final InternalServiceClient internalServiceClient;
    @Autowired
    public OpenFeignController(InternalServiceClient internalServiceClient){
        this.internalServiceClient = internalServiceClient;
    }
    @GetMapping("/internal")
    public String internalCall(){
        return "this is internal OpenFeign call: " + internalServiceClient.getInternalResource();
    }
}
