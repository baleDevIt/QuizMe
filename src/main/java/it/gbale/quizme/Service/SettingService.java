package it.gbale.quizme.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.gbale.quizme.Repository.SettingsRepository;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class SettingService {

    @Autowired
    SettingsRepository settingsRepository;

    public List<String> getAllCategoryQuestion() {
        // TODO: Ritorna tutte le categorie disponibili attualmente
        return null;
    }

    public Boolean renameCategoryQuestion(String nameCategoryOld, String nameCategoryNew) {
        // TODO: Cambia il nome della categoria dal vecchio al nuovo
        return null;
    }

    public Boolean categoryQuestionIsPresent(String nameCategory) {
        // TODO: Check se una determinata categoria è presente sul db
        return null;
    }

}
