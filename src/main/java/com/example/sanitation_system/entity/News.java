package com.example.sanitation_system.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@Entity
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String content;
    private String image; //待转换成图片

    public News(int id){
        this.id = id;
    }

    public News(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
