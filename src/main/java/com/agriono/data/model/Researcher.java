package com.agriono.data.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Researcher {
    @Id
    @GeneratedValue
    private Long id;


    private String username;

    @Column(length = 200)
    private String bio;

    private String imageUrl;

    @CreationTimestamp
    private LocalDateTime date;

    @OneToOne(cascade = CascadeType.PERSIST)
    private User user;

    @OneToMany
    private List<InfoBlog> infoBlogs;

}
