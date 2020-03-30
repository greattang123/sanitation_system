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
//环卫工人
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    //禁止password序列化
    private String password;
    @Column(unique = true)
    private String no; //工号
    private String name;
    private int age;
    private boolean sex;
    @Column(columnDefinition = "TEXT")
    private String intro;
    private String department;
    private int authority;
    @OneToMany
    private List<Achievement> achievements;
    @OneToMany
    private List<Request> requests;
    @ManyToOne
    private Head head;
    public User(int id){
        this.id = id;
    }

    public User(String no, String name) {
        this.no = no;
        this.name = name;
    }
}
