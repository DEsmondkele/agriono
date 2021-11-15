package com.agriono.data.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class InfoBlogDto {
    private Long id;
    private String title;
    private String description;
    private String imageUrl;
    private LocalDateTime date;
}
