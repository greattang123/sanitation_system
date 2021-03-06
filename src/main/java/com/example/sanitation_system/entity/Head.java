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
public class Head extends User{
    private int age;
    @Column(columnDefinition = "TEXT")
    private String intro;
    private int authority = 2;
    private String area;
}
