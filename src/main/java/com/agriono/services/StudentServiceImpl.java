package com.agriono.services;

import com.agriono.data.Analysis;
import com.agriono.data.dto.CommentDto;
import com.agriono.data.dto.PlantAlbumDto;
import com.agriono.data.dto.StudentDto;
import com.agriono.data.model.*;
import com.agriono.data.repository.CommentRepository;
import com.agriono.data.repository.PlantAlbumRepository;
import com.agriono.data.repository.StudentRepository;
import com.agriono.data.repository.UserRepo;
import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    PlantAlbumRepository plantRepository;
    @Autowired
    UserRepo userRepo;
    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @Autowired
    CommentRepository commentRepo;

    @Override
    public Student createStudent(StudentDto studentDto) {
        if(studentDto == null){
            throw new IllegalArgumentException("student info cannot be null");
        }
        User user = new User(studentDto.getEmail(),

                passwordEncoder.encode(studentDto.getPassword()),
               new UserType(Type.STUDENT) );
        Student student = Student.builder()
                .username(studentDto.getUsername())
                .bio(studentDto.getBio())
                .user(user)
                .gender(studentDto.getGender()).build();
        return studentRepository.save(student);
    }

    @Override
    public Comment writeComment(CommentDto commentDto, String email) {
            Comment comment= Comment.builder()
                    .content(commentDto.getContent())
                    .time(LocalDateTime.now())
                    .build();

        return commentRepo.save(comment);
    }

    @Override
    public Comment readComment(CommentDto commentDto){

        return null;
    }

    @Override
    public void deleteComment(Long id) {

    }

    @Override
    public PlantAlbum viewPlant(PlantAlbumDto plantAlbumDto) {
        return null;
    }

    @Override
    public Analysis analyse() {
        return null;
    }
}
