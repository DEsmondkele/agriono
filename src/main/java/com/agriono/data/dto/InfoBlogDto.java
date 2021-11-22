package com.agriono.data.dto;

import com.agriono.data.model.Comment;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class InfoBlogDto {
    private Long id;
    private String title;
    private String body;
    private String description;
    private String imageUrl;
    private LocalDateTime date;
    private List<Comment> comments;
}
