package com.example.sanitation_system.service;

import com.example.sanitation_system.entity.User;
import com.example.sanitation_system.entity.Worker;
import com.example.sanitation_system.repository.WorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class WorkerService {
    @Autowired
    private WorkRepository wr;
    @Autowired
    private UserService us;

    public Worker getWorkerById(int id){
        return wr.findById(id);
    }

    public Worker getWorkerByNo(String no){
        return wr.findByNo(no);
    }

    public Worker addWorker(Worker worker){
        us.addUser((User) worker);
        return wr.saveAndFlush(worker);
    }
}
