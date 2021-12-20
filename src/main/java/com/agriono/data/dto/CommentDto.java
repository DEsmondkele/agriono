package com.agriono.data.dto;

import com.agriono.data.model.User;
import lombok.Data;

import java.util.List;

@Data
public class CommentDto{
    private Long id;

    private String content;

    private List<User> users;

}
