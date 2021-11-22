package com.agriono.data.model;

import lombok.Data;


import java.time.LocalDateTime;

@Data
public class Comment {
    private  Integer id;
    private Integer PostId;
    private String comment;
    private  String commenter;
    private LocalDateTime time;

}
