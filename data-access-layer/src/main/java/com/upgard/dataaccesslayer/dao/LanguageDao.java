package com.upgard.dataaccesslayer.dao;

import com.upgard.dataaccesslayer.entities.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageDao extends JpaRepository<Language, Integer> {

    public Language findBylanguageName(String languageName) ;
}
