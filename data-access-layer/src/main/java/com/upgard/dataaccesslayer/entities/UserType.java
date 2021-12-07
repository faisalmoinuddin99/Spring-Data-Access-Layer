package com.upgard.dataaccesslayer.entities;


import javax.persistence.*;

@Entity
@Table(name = "user_type")
public class UserType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userTypeId ;

    @Column(nullable = false)
    private String usetTypeName = "Customer";

    public int getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
    }

    public String getUsetTypeName() {
        return usetTypeName;
    }

    public void setUsetTypeName(String usetTypeName) {
        this.usetTypeName = usetTypeName;
    }
}
