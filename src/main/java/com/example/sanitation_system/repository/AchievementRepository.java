package com.example.sanitation_system.repository;

import com.example.sanitation_system.entity.Achievement;
import com.example.sanitation_system.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AchievementRepository extends CustomizedRepository<Achievement,Integer>{
    @Query("select a from Achievement a where a.id =: id")
        //基于ID查找工作成果
    Achievement findById(@Param("id") int id);
    @Query("select a from Achievement a where a.user.id =: uid")
        //基于用户ID查找工作成果
    List<Achievement> findByUserId(@Param("uid") int uid);
    @Query("select a from Achievement a where a.head.id =: hid")
        //基于片区负责人ID查找工作成果
    List<Achievement> findByHeadId(@Param("hid") int hid);
}
