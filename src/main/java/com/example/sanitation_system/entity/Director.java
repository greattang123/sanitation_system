package com.example.sanitation_system.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
//环卫主任
public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    //禁止password序列化
    private String password;
    @Column(unique = true)
    private String no; //工号
    private String name;
    private boolean sex;
    @OneToMany
    private List<Head> heads;

    public Director(int id){
        this.id = id;
    }

    public Director(String no, String name) {
        this.no = no;
        this.name = name;
    }
}
