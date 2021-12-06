package com.upgard.dataaccesslayer.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "language")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int languageId ;

    @Column(nullable = false, unique = true)
    private String languageName ;

    public int getLanguageId() {
        return languageId;
    }





    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }
}
