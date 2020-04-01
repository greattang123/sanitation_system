package com.example.sanitation_system.repository;

import com.example.sanitation_system.entity.Head;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HeadRepository extends CustomizedRepository<Head,Integer>{
    @Query("select h from Head h where h.id =: id")
        //基于ID查找片区负责人
    Head findById(@Param("id") int id);
    @Query("select h from Head h where h.no =: no")
        //基于工号查找片区负责人
    Head findByNo(@Param("no") String no);
    @Query("select h from Head h where h.name is not null order by h.no")
        //获取所有片区负责人列表
    List<Head> findAllHead();
}
