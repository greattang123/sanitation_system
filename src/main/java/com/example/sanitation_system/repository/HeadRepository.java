package com.example.sanitation_system.repository;

import com.example.sanitation_system.entity.Head;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HeadRepository extends CustomizedRepository<Head,Integer>{
    @Query("select h from Head h where h.id =:id")
    Head findById(@Param("id") int id);

    @Query("select h from Head h where h.no =:no")
    Head findByNo(@Param("no") String no);

    @Query("select h from Head h where h.name is not null order by h.no")
    List<Head> findAllHead();
}
