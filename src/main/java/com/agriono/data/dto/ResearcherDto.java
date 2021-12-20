package com.agriono.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResearcherDto {
    private Long id;
    private String username;
    private  String email;
    private  String password;
    private String bio;
    private String imageUrl;
    private LocalDateTime date;
}
