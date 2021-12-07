package com.upgard.dataaccesslayer.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId ;

    @Column(name = "first_name", length = 20, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 20)
    private String lastName ;

    @Column(name = "user_name", length = 20, nullable = false, unique = true)
    private String userName ;

    @Column(length = 8, nullable = false)
    private String password ;

    @Column(nullable = false)
    private LocalDateTime dateOfBirth ;

    @ManyToOne
    @JoinColumn(name = "userTypeId", nullable = false)
    private UserType userType ;

    @ManyToOne
    @JoinColumn(name = "languageId", nullable = false)
    private Language language ;

    public int getCust_id() {
        return customerId;
    }

    public void setCust_id(int cust_id) {
        this.customerId = cust_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
