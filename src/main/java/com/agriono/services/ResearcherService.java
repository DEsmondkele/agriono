package com.agriono.services;

import com.agriono.data.dto.InfoBlogDto;
import com.agriono.data.dto.ResearcherDto;
import com.agriono.data.model.InfoBlog;
import com.agriono.data.model.Researcher;
import com.agriono.exception.UserAlreadyExistException;

public interface ResearcherService {
    Researcher save(ResearcherDto researcherDto) throws UserAlreadyExistException;
    public InfoBlog saveBlog(InfoBlogDto infoBlogDto);
    public  InfoBlog updateBlog(InfoBlogDto infoBlogDto, Long id);
}
