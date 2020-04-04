package com.example.sanitation_system.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Ask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String theme;
    private String content;
    @ManyToOne
    private User user;

    public Ask(int id){
        this.id = id;
    }

    public Ask(String theme, String content) {
        this.theme = theme;
        this.content = content;
    }
}
