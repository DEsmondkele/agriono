package com.agriono.services;

import com.agriono.data.dto.InfoBlogDto;
import com.agriono.data.dto.ResearcherDto;
import com.agriono.data.model.*;
import com.agriono.data.repository.InfoBlogRepository;
import com.agriono.data.repository.ResearcherRepository;
import com.agriono.data.repository.UserRepo;
import com.agriono.exception.UserAlreadyExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Objects;

@Service
public class ResearcherServiceImpl implements ResearcherService{
    @Autowired
    ResearcherRepository researcherRepository;
    @Autowired
    UserRepo userRepo;
    @Autowired
    InfoBlogRepository infoBlogRepository;
    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @Override
    public Researcher save(ResearcherDto researcherDto) throws UserAlreadyExistException {
        if (researcherDto == null) {
            throw new IllegalArgumentException("Researcher can not be null");
        }
        if (userRepo.findByEmail(researcherDto.getEmail()) == null) {
            User user = new User(researcherDto.getEmail(),
                    passwordEncoder.encode(researcherDto.getPassword()),
                    new UserType(Type.RESEARCHER));

            Researcher researcher = Researcher.builder()
                    .username(researcherDto.getUsername())
                    .bio(researcherDto.getBio())
                    .user(user).build();
            return researcherRepository.save(researcher);
        }
        else {
            throw new UserAlreadyExistException("user with this "+ researcherDto.getEmail()
            + " email already exist!");
        }

    }

    @Override
    public InfoBlog saveBlog(InfoBlogDto infoBlogDto) {
if (infoBlogDto == null){
    throw  new IllegalArgumentException("infBlog can not be null");
}
InfoBlog infoBlog = InfoBlog.builder()
        .title(infoBlogDto.getTitle())
        .description(infoBlogDto.getDescription())
        .body(infoBlogDto.getBody())
        .dateCreated(LocalDateTime.now())
        .build();
        return infoBlogRepository.save(infoBlog);
    }

    @Override
    public InfoBlog updateBlog(InfoBlogDto infoBlogDto, Long id) {
        if(Objects.equals(infoBlogDto.getId(), id)){

        }
        return null;
    }


}
