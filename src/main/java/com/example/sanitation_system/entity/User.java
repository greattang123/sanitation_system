package com.example.sanitation_system.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(unique = true)
    private String no; //工号
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    //禁止password序列化
    private String password;
    private String name;
    private Boolean sex;
    public static final int WORKER_AUTHORITY = 1;
    public static final int HEAD_AUTHORITY = 2;
    public static final int DIRECTOR_AUTHORITY = 3;
    private int authority = 0;
}
