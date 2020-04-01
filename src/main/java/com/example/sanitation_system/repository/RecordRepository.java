package com.example.sanitation_system.repository;

import com.example.sanitation_system.entity.Record;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecordRepository extends CustomizedRepository<Record,Integer>{
    @Query("select r from Record r where r.id =: id")
    Record findById(@Param("id") int id);
    @Query("select r from Record r where r.licence =: licence")
    List<Record> findByLicence(@Param("licence") String licence);
    @Query("select r from Record r where r.detail is not null")
    List<Record> findAllRecord();
}
