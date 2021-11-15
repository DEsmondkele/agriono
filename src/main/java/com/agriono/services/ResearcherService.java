package com.agriono.services;

import com.agriono.data.dto.InfoBlogDto;
import com.agriono.data.dto.ResearcherDto;
import com.agriono.data.model.InfoBlog;
import com.agriono.data.model.Researcher;

public interface ResearcherService {
    public ResearcherDto save();
    public InfoBlogDto saveBlog();
}
