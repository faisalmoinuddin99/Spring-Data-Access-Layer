package com.upgard.dataaccesslayer.service;

import com.upgard.dataaccesslayer.dao.LanguageDao;
import com.upgard.dataaccesslayer.entities.Language;
import com.upgard.dataaccesslayer.exceptions.LanguageDetailsNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "languageService")
public class LanguageServiceImpl implements LanguageService{

    @Autowired
    private LanguageDao languageDao ;

    @Override
    public Language acceptLanguageDetails(Language language) {
        return languageDao.save(language);
    }

    @Override
    public Language getLanguageDetails(int id) throws LanguageDetailsNotFoundException {
        return languageDao.findById(id)
                .orElseThrow(
                        () -> new LanguageDetailsNotFoundException("Language not found by id: " + id)
                ) ;
    }

    @Override
    public Language getLanguageDetailsByLanguageName(String languageName) throws LanguageDetailsNotFoundException {
        return languageDao.findBylanguageName(languageName) ;
    }

    @Override
    public boolean deleteLanguage(int id) throws LanguageDetailsNotFoundException {
        Language savedLanguage = getLanguageDetails(id) ;
        languageDao.delete(savedLanguage);

        return true;
    }

    @Override
    public List<Language> getAllLanguageDetails() {
        return languageDao.findAll();
    }
}
