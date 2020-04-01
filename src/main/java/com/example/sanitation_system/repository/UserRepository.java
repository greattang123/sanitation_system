package com.example.sanitation_system.repository;

import com.example.sanitation_system.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CustomizedRepository<User,Integer> {
    @Query("select u from User u where u.id =: id")
        //基于id查找用户
    User findById(@Param("id") int id);
    @Query("select u from User u where u.no =: no")
        //基于工号查找用户
    User findByNo(@Param("no") String no);
    @Query("select u from User u where u.name is not null order by u.no")
        //获取所有用户列表
    List<User> findAllUser();
}
