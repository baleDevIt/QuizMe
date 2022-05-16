package it.gbale.quizme.Entity;

import java.util.Map;

import it.gbale.quizme.Configuration.SettingsEnum;
import lombok.Data;

@Data
public class Settings {
    private SettingsEnum id;
    private Map<String, String> settingPool;
}
