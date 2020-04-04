package com.example.sanitation_system.repository;

import com.example.sanitation_system.entity.Director;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectorRepository extends CustomizedRepository<Director,Integer>{
    @Query("select d from Director d where d.id =:id")
    Director findById(@Param("id") int id);

    @Query("select d from Director d where d.no =:no")
    Director findByNo(@Param("no") String no);
}
