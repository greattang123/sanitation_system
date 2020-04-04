package com.example.sanitation_system.service;

import com.example.sanitation_system.entity.User;
import com.example.sanitation_system.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository ur;
    @Autowired
    private PasswordEncoder pe;

    public User getUserById(int id){
        return ur.findById(id);
    }

    public User getUserByNo(String no){
        return ur.findByNo(no);
    }

    public List<User> getAllUser(){
        return ur.findAllUser();
    }

    public User addUser(User user){
        user.setPassword(pe.encode(user.getNo()));
        return ur.saveAndFlush(user);
    }

    public User updateUser(User user){
        user.setPassword(pe.encode(user.getNo()));
        return Optional.ofNullable(ur.findById(user.getId()))
                .or(() ->{
                    throw new ResponseStatusException(HttpStatus.FORBIDDEN, "无权限");
                })
                .map(a -> ur.saveAndFlush(user))
                .get();
    }
}
