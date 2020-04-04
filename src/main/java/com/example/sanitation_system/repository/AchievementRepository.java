package com.example.sanitation_system.repository;

import com.example.sanitation_system.entity.Achievement;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AchievementRepository extends CustomizedRepository<Achievement,Integer>{
    @Query("select a from Achievement a where a.id =:id")
    Achievement findById(@Param("id") int id);

    @Query("select a from Achievement a where a.user.id =:uid")
    List<Achievement> findByUserId(@Param("uid") int uid);

    @Query("from Achievement")
    List<Achievement> allAchievement();
}
