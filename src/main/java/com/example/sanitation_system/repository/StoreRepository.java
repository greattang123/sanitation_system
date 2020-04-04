package com.example.sanitation_system.repository;

import com.example.sanitation_system.entity.Store;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends CustomizedRepository<Store,Integer>{
    @Query("select s from Store s where s.id =:id")
    Store findById(@Param("id") int id);

    @Query("select s from Store s where s.name =:name")
    Store findByName(@Param("name") String name);

    @Query("select s from Store s where s.name is not null order by s.number")
    Store findAllStore();
}
