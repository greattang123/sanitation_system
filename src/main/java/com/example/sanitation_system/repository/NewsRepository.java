package com.example.sanitation_system.repository;

import com.example.sanitation_system.entity.News;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsRepository extends CustomizedRepository<News,Integer>{
    @Query("select n from News n where n.id =: id")
    News findById(@Param("id") int id);
    @Query("select n from News n where n.content is not null")
    List<News> findAllNews();
}
