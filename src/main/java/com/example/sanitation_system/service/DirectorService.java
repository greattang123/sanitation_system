package com.example.sanitation_system.service;

import com.example.sanitation_system.entity.Director;
import com.example.sanitation_system.entity.User;
import com.example.sanitation_system.repository.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class DirectorService {
    @Autowired
    private DirectorRepository dr;
    @Autowired
    private UserService us;

    public Director getDirectorById(int id){
        return dr.findById(id);
    }

    public Director getDirectorByNo(String no){
        return dr.findByNo(no);
    }

    public Director addDirector(Director director){
        us.addUser((User)director);
        return dr.saveAndFlush(director);
    }
}
