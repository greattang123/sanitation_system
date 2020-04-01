package com.example.sanitation_system.repository;

import com.example.sanitation_system.entity.Task;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CustomizedRepository<Task,Integer>{
    @Query("select t from Task t where t.id =: id")
    Task findById(@Param("id") int id);

}
