package com.example.sanitation_system.repository;

import com.example.sanitation_system.entity.Worker;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkRepository extends CustomizedRepository<Worker,Integer>{
    @Query("select w from Worker w where w.id=:id")
    Worker findById(@Param("id") int id);

    @Query("select w from Worker w where w.no=:no")
    Worker findByNo(@Param("no") String no);
}
