package com.agriono.data.dto;

import com.agriono.data.model.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    private int id;
    private String username;
    private String email;
    private String password;
    @Column(length = 250)
    private  String bio;
    private Gender gender;


//    public void setBio(String bio) {
//        this.bio = bio;
//    }
}
