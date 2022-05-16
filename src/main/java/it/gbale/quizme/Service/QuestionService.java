package it.gbale.quizme.Service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.gbale.quizme.Entity.Question;
import it.gbale.quizme.Entity.Round;
import it.gbale.quizme.Repository.QuestionRepository;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class QuestionService {

    @Autowired
    QuestionRepository questionRepository;

    /*
     * @Autowired
     * CategoryRepository categoryRepository;
     */

    /**
     * Salva una nuova domanda sul db nel formato dettato da QuestionType.json
     */
    public Question saveNewQuestion(Question question) {
        StringBuilder logMessage = new StringBuilder(this.getClass().getName() + " - ");
        // TODO: Validare la domanda che stiamo per inserire
        Question returnedQuestion = questionRepository.insert(question);
        if (returnedQuestion != null) {
            logMessage.append("New question saved!");
            log.info(logMessage);
            return returnedQuestion;
        }
        logMessage.append("Something went wrong!");
        log.info(logMessage);
        return null;
    }

    /**
     * Restituisce una domanda a caso data una determinata categoria
     */
    public Question getRandomQuestion(String argument) {
        // TODO: Ritorna una domanda a caso dato un determinato argomento
        return null;
    }

    /**
     * Restituisce una specifica domanda passando l'id della domanda
     */
    public Question getQuestion(UUID id) {
        // TODO: Ricerca di una domanda con id specifico, se non trovata tornare null
        return null;

    }

    /**
     * Restituisce la lista di tutte le domande presenti per una determinata
     * categoria
     */
    public List<Question> listQuestionFromCategory(UUID idcategory) {
        // TODO: Da implementare aggiungendo altri parametri di ricerca
        return null;
    }

    /**
     * Salva una nuova domanda sul db nel formato dettato da QuestionType.json
     */
    public Boolean deleteQuestion(UUID idQuestion) {
        StringBuilder logMessage = new StringBuilder(this.getClass().getName() + " - ");
        // TODO: Validare la domanda che stiamo per inserire
        logMessage.append("Something went wrong!");
        log.info(logMessage);
        return null;
    }

    /**
     * Restituisce un nuovo oggetto round che con è altro che la somma delle domande
     * di ogni partita con altre informazioni
     */
    public Round newRound(UUID idCategory) {
        // TODO: Restitusce un nuovo round
        return null;
    }

}
