package com.example.sanitation_system.service;

import com.example.sanitation_system.entity.Achievement;
import com.example.sanitation_system.entity.Head;
import com.example.sanitation_system.entity.User;
import com.example.sanitation_system.repository.AchievementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AchievementService {
    @Autowired
    private AchievementRepository ar;

    public Achievement getAchievement(int id) {
        return ar.findById(id);
    }

    public List<Achievement> getAchievementByUser(User user) {
        return ar.findByUserId(user.getId());
    }

    public Achievement addAchievement(Achievement achievement) {
        return ar.saveAndFlush(achievement);
    }

    public Achievement updateAchievement(Achievement achievement) {
        return Optional.ofNullable(ar.findById(achievement.getId()))
                .or(() -> {
                    throw new ResponseStatusException(HttpStatus.FORBIDDEN, "无权限");
                })
                .map(a -> ar.saveAndFlush(achievement))
                .get();
    }
}
