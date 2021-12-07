package com.upgard.dataaccesslayer.entities;


import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Entity
@Table(name = "user_type")
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class UserType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userTypeId ;

    @Column(nullable = false)
    private String userTypeName = "Customer";

    public int getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
    }

    public String getUsetTypeName() {
        return userTypeName;
    }

    public void setUsetTypeName(String userTypeName) {
        this.userTypeName = userTypeName;
    }
}
