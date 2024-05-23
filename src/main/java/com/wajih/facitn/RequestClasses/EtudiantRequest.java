package com.wajih.facitn.controller;

import lombok.Data;

@Data
public class EtudiantRequest {
    private String cin;
    private String full_name;
    private String email;
    private String password;
    private String avatar;
    private String role;
    private String fac;
    private Long tel;
    private Long class_id;

    // Getters and setters (omitted for brevity)
}
