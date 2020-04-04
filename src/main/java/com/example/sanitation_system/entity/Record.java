package com.example.sanitation_system.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String licence;
    private String outTime;  //出车时间
    private String backTime; //回来时间
    private String location; //途经地点
    @Column(columnDefinition = "TEXT")
    private String detail;

    public Record(int id){
        this.id = id;
    }

    public Record(String licence, String detail) {
        this.licence = licence;
        this.detail = detail;
    }
}
