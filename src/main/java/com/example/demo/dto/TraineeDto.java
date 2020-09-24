package com.example.demo.dto;

import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.validation.constraints.NotBlank;

public class TraineeDto {
    @GeneratedValue
    @Id
    private int id;

    @NotBlank
    private String name;

    @NotBlank
    private String email;

    @NotBlank
    private String office;

    @NotBlank
    private String zoomId;

    @NotBlank
    private String gitAccount;
}
