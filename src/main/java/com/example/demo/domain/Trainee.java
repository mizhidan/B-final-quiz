package com.example.demo.domain;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class Trainee {

    @NotBlank
    private String name;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String office;

    @NotBlank
    private String zoomId;

    @NotBlank
    private String gitAccount;
}
