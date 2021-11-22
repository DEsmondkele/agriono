package com.agriono.data.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true,nullable = false)
    @NotBlank @NotNull
    private String email;

    private  boolean enabled;

    @Column(nullable = false)
    @NotBlank
    @NotNull
    private String password;

    @CreationTimestamp
    private LocalDateTime date;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<UserType> userTypes;

    public User( String email, String password, UserType userType){
        this.email = email;
        this.password = password;
        addUserType(userType);
        this.enabled = false;

    }

//    public User(String email) {
//        this.email = email;
//    }

    public void addUserType(UserType userType){
        if(this.userTypes == null){
            this.userTypes = new ArrayList<>();
        }
        this.userTypes.add(userType);
    }
}
