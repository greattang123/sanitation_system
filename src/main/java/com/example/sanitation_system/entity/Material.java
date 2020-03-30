package com.example.sanitation_system.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int no; //内部编号
    private String category;
    private String name;
    private String maker;
    private String date;
    private int number; //数量
    private float price; //单价
    @ManyToOne
    private Store store;
    public Material(int id){
        this.id = id;
    }

    public Material(int no, String category, String name) {
        this.no = no;
        this.category = category;
        this.name = name;
    }
}
