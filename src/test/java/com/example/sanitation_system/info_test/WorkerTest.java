package com.example.sanitation_system.info_test;

import com.example.sanitation_system.entity.Worker;
import com.example.sanitation_system.service.HeadService;
import com.example.sanitation_system.service.UserService;
import com.example.sanitation_system.service.WorkerService;
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
public class WorkerTest {
    @Autowired
    private WorkerService ws;
    @Autowired
    private HeadService hs;

    @Test
    public void addWorkTest(){
        Worker worker = new Worker();
        worker.setNo("005");
        worker.setName("孙七");
        worker.setAge(47);
        worker.setIntro("暂无");
        worker.setDepartment("清雪组");
        worker.setHead(hs.getHeadByNo("002"));
        ws.addWorker(worker);
    }
}
