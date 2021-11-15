package com.agriono.data.repository;

import com.agriono.data.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
