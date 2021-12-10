package com.upgard.dataaccesslayer;

import com.upgard.dataaccesslayer.dao.LanguageDao;
import com.upgard.dataaccesslayer.entities.Language;
import com.upgard.dataaccesslayer.exceptions.LanguageDetailsNotFoundException;
import com.upgard.dataaccesslayer.service.LanguageService;
import com.upgard.dataaccesslayer.service.LanguageServiceImpl;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.text.ParseException;
import java.util.Optional;

@RunWith(MockitoJUnitRunner.class)
@ContextConfiguration(locations = {"classpath:mtbBeans.xml"})
public class LanguageServiceTest {

    @Mock
    private LanguageDao languageDao ;

    @InjectMocks
    private LanguageServiceImpl languageService ;

    public static Language language ;

    @BeforeClass
    public static void setUpTestEnv() throws ParseException {
        language = new Language() ;
    }

    @Before
    public void setUpMockito() {
        language.setLanguageId(1);
        language.setLanguageName("English");

        Mockito.when(languageDao.save(language)).thenReturn(language) ;
        Mockito.when(languageDao.findByLanguageName("English")).thenReturn(Optional.of(language)) ;
        Mockito.when(languageDao.findById(1)).thenReturn(Optional.ofNullable(language)) ;
    }
    @Test
    public void testAcceptLanguageDetails(){
        Assert.assertEquals(language,languageService.acceptLanguageDetails(language));
    }

    @Test
    public void testGetLanguageDetailsByLanguageName() throws LanguageDetailsNotFoundException {
        Assert.assertEquals(language,languageService.getLanguageDetailsByLanguageName("English"));
    }

    @Test
    public void testGetLanguageDetails() throws LanguageDetailsNotFoundException {
        Assert.assertEquals(language, languageService.getLanguageDetails(1));
    }
}
