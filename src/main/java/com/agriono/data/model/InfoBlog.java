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
@NoArgsConstructor
@AllArgsConstructor
public class InfoBlog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 200)
    private String title;

    @Column(length = 1000)
    private String description;

    @Column(length = 100000)
    private String body;

    private String imageUrl;
    @CreationTimestamp
    private LocalDateTime dateCreated;

    @ManyToOne
    private  Researcher researcher;

    @OneToMany
    private List<Comment> comments;
}
