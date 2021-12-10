package com.upgard.dataaccesslayer.dao;

import com.upgard.dataaccesslayer.entities.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("languageDAO")
public interface LanguageDao extends JpaRepository<Language, Integer> {

    public Language findByLanguageName(String languageName) ;
}
