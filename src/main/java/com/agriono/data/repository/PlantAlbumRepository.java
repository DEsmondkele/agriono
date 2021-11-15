package com.agriono.data.repository;

import com.agriono.data.model.PlantAlbum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public interface PlantAlbumRepository extends JpaRepository<PlantAlbum,Long> {

}
