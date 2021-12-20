package com.agriono.services;

import com.agriono.data.dto.CommentDto;
import com.agriono.data.dto.InfoBlogDto;
import com.agriono.data.dto.PlantAlbumDto;
import com.agriono.data.dto.ResearcherDto;
import com.agriono.data.model.Comment;
import com.agriono.data.model.InfoBlog;
import com.agriono.data.model.PlantAlbum;
import com.agriono.data.model.Researcher;
import com.agriono.exception.UserAlreadyExistException;

public interface ResearcherService {
    Researcher save(ResearcherDto researcherDto) throws UserAlreadyExistException;
    public InfoBlog saveBlog(InfoBlogDto infoBlogDto);
    public  InfoBlog updateBlog(InfoBlogDto infoBlogDto, Long id);
    public Comment createComment(CommentDto commentDto);
    public  void deleteComment(Long id);
    public PlantAlbum createPlantAlbum(PlantAlbumDto plantAlbumDto);
    public  PlantAlbum updatePlantAlbum(PlantAlbumDto plantAlbumDto);
}
