package com.agriono.services;

import com.agriono.data.Analysis;
import com.agriono.data.dto.CommentDto;
import com.agriono.data.dto.PlantAlbumDto;
import com.agriono.data.dto.StudentDto;
import com.agriono.data.model.Comment;
import com.agriono.data.model.PlantAlbum;
import com.agriono.data.model.Student;

public interface StudentService {
    public Student createStudent(StudentDto studentDto);
    public Comment writeComment(CommentDto commentDto,String email);
    public Comment readComment(CommentDto commentDto);
    public  void deleteComment(Long id);
    public PlantAlbum viewPlant(PlantAlbumDto plantAlbumDto);
    public Analysis analyse();
}
