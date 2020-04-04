package com.example.sanitation_system.info_test;

import com.example.sanitation_system.entity.User;
import com.example.sanitation_system.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
    @Autowired
    private UserService us;

    @Test
    public void addUserTest(){
        User user = new User();
        user.setNo("001");
        user.setName("张三");
        us.addUser(user);
    }

    @Test
    public void updateUserTest(){
        User user = us.getUserById(1);
        user.setName("无名");
        user.setNo("000");
        us.updateUser(user);
    }
}
