package it.gbale.quizme.Repository;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import it.gbale.quizme.Entity.Question;

@Repository
public interface QuestionRepository extends MongoRepository<Question, UUID> {

}
