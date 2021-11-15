package com.agriono.data.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ResearcherDto {
    private Long id;
    private String username;
    private  String email;
    private  String password;
    private String bio;
    private String imageUrl;
    private LocalDateTime date;
}
