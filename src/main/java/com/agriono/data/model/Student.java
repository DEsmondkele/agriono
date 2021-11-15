package com.agriono.data.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @NotNull
    @Column(nullable = false)
    private String username;


    @Column(length = 200)
    private String bio;

    @Enumerated(EnumType.STRING)
    private  Gender gender;

    private String imageUrl;

    @OneToOne(cascade = CascadeType.PERSIST)
    private User user;

    @CreationTimestamp
    private LocalDateTime date;
}
