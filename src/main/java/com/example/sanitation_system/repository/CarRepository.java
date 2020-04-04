package com.example.sanitation_system.repository;

import com.example.sanitation_system.entity.Car;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends CustomizedRepository<Car,Integer>{
    @Query("select c from Car c where c.id =:id")
    Car findById(@Param("id") int id);

    @Query("select c from Car c where c.licence =:licence")
    Car findByLicence(@Param("licence") String licence);

    @Query("select c from Car c where c.no =:no")
    Car findByNo(@Param("no") String no);

    @Query("select c from Car c where c.licence is not null order by c.no")
    List<Car> findAllCar();
}
