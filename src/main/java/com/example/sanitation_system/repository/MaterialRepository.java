package com.example.sanitation_system.repository;

import com.example.sanitation_system.entity.Material;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaterialRepository extends CustomizedRepository<Material,Integer>{
    @Query("select ma from Material ma where ma.id =: id")
    Material findById(@Param("id") int id);
    @Query("select ma from Material ma where ma.no =: no")
    Material findByNo(@Param("no") String no);
    @Query("select ma from Material ma where ma.category =: category")
        //基于分类查找材料
    List<Material> findByCategory(@Param("category") String category);
    @Query("select ma from Material ma where ma.name =: name")
    Material findByName(@Param("name") String name);
    @Query("select ma from Material ma where ma.id is not null order by ma.number")
    List<Material> findAllMaterial();
}
