package com.example.sanitation_system.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jboss.jandex.Main;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Maintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String licence;
    private String charger;
    private String worker; //维修工人
    private String date;
    private String cause;
    @Column(columnDefinition = "TEXT")
    private String result;

    public Maintenance(int id){
        this.id = id;
    }

    public Maintenance(String licence, String charger, String result) {
        this.licence = licence;
        this.charger = charger;
        this.result = result;
    }
}
