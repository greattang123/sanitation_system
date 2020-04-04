package com.example.sanitation_system.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Instruction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //请求id request id是否需要?
    private String theme;
    private String content;
    private String instructor;

    public Instruction(int id){
        this.id = id;
    }

    public Instruction(String theme, String content, String instructor) {
        this.theme = theme;
        this.content = content;
        this.instructor = instructor;
    }
}
