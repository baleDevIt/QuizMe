package it.gbale.quizme.Repository;

import java.util.Map;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import it.gbale.quizme.Configuration.SettingsEnum;
import it.gbale.quizme.Entity.Settings;

@Repository
public interface SettingsRepository extends MongoRepository<Settings, SettingsEnum> {

}
