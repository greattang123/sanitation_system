package com.example.sanitation_system.repository;

import com.example.sanitation_system.entity.Instruction;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructionRepository extends CustomizedRepository<Instruction,Integer>{
    @Query("select i from Instruction i where i.id =: id")
    Instruction findById(@Param("id") int id);

}
