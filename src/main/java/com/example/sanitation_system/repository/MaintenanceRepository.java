package com.example.sanitation_system.repository;

import com.example.sanitation_system.entity.Maintenance;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaintenanceRepository extends CustomizedRepository<Maintenance,Integer>{
    @Query("select m from Maintenance m where m.id =: id")
    Maintenance findById(@Param("id") int id);
    @Query("select m from Maintenance m where m.licence =: licence")
    List<Maintenance> findByLicence(@Param("licence") String licence);
    @Query("select m from Maintenance m where m.licence is not null")
    List<Maintenance> findAllMaintenance();
}
