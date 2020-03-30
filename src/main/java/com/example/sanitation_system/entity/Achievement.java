package com.example.sanitation_system.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Achievement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String theme;
    private String content;
    private String image; //待转换成图片
    @ManyToOne
    private User user;
    @ManyToOne
    private Head head;

    public Achievement(int id){
        this.id = id;
    }

    public Achievement(String theme, String content, User user) {
        this.theme = theme;
        this.content = content;
        this.user = user;
    }
}
