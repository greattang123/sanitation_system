package com.example.sanitation_system.info_test;

import com.example.sanitation_system.entity.Director;
import com.example.sanitation_system.service.DirectorService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class DirectorTest {
    @Autowired
    private DirectorService ds;

    @Test
    public void addDirectorTest(){
        Director director = new Director();
        director.setNo("001");
        director.setName("张三");
        director.setSex(true);
        ds.addDirector(director);
    }
}
