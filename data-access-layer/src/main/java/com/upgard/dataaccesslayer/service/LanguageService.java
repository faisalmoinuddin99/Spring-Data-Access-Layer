package com.upgard.dataaccesslayer.service;

import com.upgard.dataaccesslayer.entities.Language;
import com.upgard.dataaccesslayer.exceptions.LanguageDetailsNotFoundException;

import java.util.List;

public interface LanguageService {

    public Language acceptLanguageDetails(Language language) ;
    public Language getLanguageDetails(int id) throws LanguageDetailsNotFoundException ;
    public Language getLanguageDetailsByLanguageName(String languageName) throws LanguageDetailsNotFoundException ;
    public boolean deleteLanguage(int id) throws LanguageDetailsNotFoundException ;
    public List<Language> getAllLanguageDetails() ;

}
