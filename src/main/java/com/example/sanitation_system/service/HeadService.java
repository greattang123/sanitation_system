package com.example.sanitation_system.service;

import com.example.sanitation_system.entity.Head;
import com.example.sanitation_system.entity.User;
import com.example.sanitation_system.entity.Worker;
import com.example.sanitation_system.repository.HeadRepository;
import com.example.sanitation_system.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class HeadService {
    @Autowired
    private HeadRepository hr;
    @Autowired
    private UserService us;

    public Head getHeadById(int id){
        return hr.findById(id);
    }

    public Head getHeadByNo(String no){
        return hr.findByNo(no);
    }

    public Head getHeadByWorker(Worker worker){
        int hid = worker.getHead().getId();
        return hr.findById(hid);
    }

    public List<Head> getAllHead(){
        return hr.findAllHead();
    }

    public Head addHead(Head head){
        us.addUser((User)head);
        return hr.saveAndFlush(head);
    }

}
