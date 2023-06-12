package com.example.demo.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserProfile implements Serializable {

    private static final long serialVersionUID = 1L;

    private String birthDate;

    private String name;
    
    private String job;

}
