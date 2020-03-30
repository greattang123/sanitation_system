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
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int no; //内部编号
    private String licence; //车牌
    private String name;
    private String date; //出厂日期
    private String maker; //制造商
    private String charger; //负责人

    public Car(int id){
        this.id = id;
    }

    public Car(int no, String licence) {
        this.no = no;
        this.licence = licence;
    }
}
