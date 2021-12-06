package com.upgard.dataaccesslayer.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cityId ;

    @Column(nullable = false)
    private String cityName ;


    @OneToMany(mappedBy = "city", fetch = FetchType.EAGER)
    private Set<Theatre> theatres ;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
