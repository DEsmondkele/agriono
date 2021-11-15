package com.agriono.data.repository;

import com.agriono.data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Service
public interface UserRepo extends  JpaRepository<User, Long>{

}
