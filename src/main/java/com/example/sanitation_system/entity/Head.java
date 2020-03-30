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
//片区负责人
public class Head {
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
    @Column(columnDefinition = "TEXT")
    private String intro;
    private String area;
    @OneToMany
    private List<User> users;
    @OneToMany
    private List<Request> requests;
    @OneToMany
    private List<Achievement> achievements;
    @ManyToOne
    private Director director;
    public Head(int id){
        this.id = id;
    }

    public Head(String no, String name) {
        this.no = no;
        this.name = name;
    }
}
