package com.upgard.dataaccesslayer.entities;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "language")
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int languageId ;

    @Column(nullable = false, unique = true)
    private String languageName ;

    public Language(int languageId, String languageName) {
        this.languageId = languageId;
        this.languageName = languageName;
    }

    public Language() {

    }

    public Language(String languageName) {
        this.languageName = languageName;
    }

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
