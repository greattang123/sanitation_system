package com.example.sanitation_system.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Worker extends User {
    private int age;
    @Column(columnDefinition = "TEXT")
    private String intro;
    private int authority = 1;
    private String department;
    @ManyToOne
    private Head head;
}
