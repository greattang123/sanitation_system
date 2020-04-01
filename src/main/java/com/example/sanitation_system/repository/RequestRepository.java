package com.example.sanitation_system.repository;

import com.example.sanitation_system.entity.Request;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RequestRepository extends CustomizedRepository<Request,Integer>{
    @Query("select re from Request re where re.id =: id")
    Request findById(@Param("id") int id);
    @Query("select re from Request re where re.user.id =: uid")
    List<Request> findByUId(@Param("uid") int uid);
    @Query("select re from Request re where re.head.id =: hid")
    List<Request> findByHId(@Param("hid") int hid);
}
