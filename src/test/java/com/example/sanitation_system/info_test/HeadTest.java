package com.example.sanitation_system.info_test;

import com.example.sanitation_system.entity.Head;
import com.example.sanitation_system.service.HeadService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Table;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class HeadTest {
    @Autowired
    private HeadService hs;

    @Test
    public void addHeadTest(){
        Head head = new Head();
        head.setNo("002");
        head.setName("李四");
        head.setAge(32);
        head.setSex(false);
        head.setIntro("暂无");
        head.setArea("市中区");
        hs.addHead(head);
    }
}
