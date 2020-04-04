package com.example.sanitation_system.repository;

import com.example.sanitation_system.entity.Ask;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AskRepository extends CustomizedRepository<Ask,Integer>{
    @Query("select ask from Ask ask where ask.id=:id")
    Ask findById(@Param("id") int id);

    @Query("select ask from Ask ask where ask.user.id=:uid")
    List<Ask> findByUserId(@Param("uid") int uid);
}
