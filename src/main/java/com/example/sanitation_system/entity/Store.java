package com.example.sanitation_system.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String category;
    private int number; //现有数量
    private String name;
    @OneToMany
    private List<Material> materialList;

    public Store(int id){
        this.id = id;
    }

    public Store(int number, String name) {
        this.number = number;
        this.name = name;
    }
}
