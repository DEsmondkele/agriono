package com.agriono.data.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PlantAlbum {
    private Long id;
    private String name;
    private String description;
    private String imageUrl;
    private LocalDateTime date;


}
