package it.gbale.quizme.Controller;

import java.util.List;
import java.util.UUID;

import org.bson.json.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.gbale.quizme.Entity.Category;
import it.gbale.quizme.Entity.Question;
import it.gbale.quizme.Service.QuestionService;
import lombok.extern.log4j.Log4j2;
import it.gbale.quizme.Utils.Validator;
import it.gbale.quizme.Utils.Validator.*;

@Log4j2
@RestController
@RequestMapping(path = "/")
public class DashboardController {

    @Autowired
    QuestionService questionService;

    @RequestMapping(method = RequestMethod.GET, path = "/login", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<JsonObject> login() {
        return new ResponseEntity<JsonObject>(HttpStatus.OK);
    }

    /** ---------- QUESTION ---------- */

    /**
     * Restituisce la domanda collegata ad uno specifico id
     */
    @RequestMapping(method = RequestMethod.GET, path = "/question", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Question> getQuestion(@RequestParam(required = true) UUID id) {
        StringBuilder logMessage = new StringBuilder(this.getClass().getName() + " - ");
        try {
            Question returnedQuestion = questionService.getQuestion(id);
            if (returnedQuestion != null) {
                logMessage.append("Question found with id " + id.toString());
                log.info(logMessage);
                return new ResponseEntity<>(returnedQuestion, HttpStatus.OK);
            } else {
                logMessage.append("Question NOT found with id");
                log.info(logMessage);
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }

        } catch (Exception e) {
            logMessage.append("Something went wrong");
            log.error(logMessage);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    /**
     * Salva una nuova domanda nell'archivio
     */
    @RequestMapping(method = RequestMethod.POST, path = "/question", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Question> saveNewQuestion(@RequestBody(required = true) Question question) {
        StringBuilder logMessage = new StringBuilder(this.getClass().getName() + " - ");
        try {
            Validator.isValidQuestion(question);
            Question savedQuestion = questionService.saveNewQuestion(question);
            logMessage.append("Question correctly saved!");
            log.info(logMessage);
            return new ResponseEntity<>(savedQuestion, HttpStatus.OK);
        } catch (Exception e) {
            logMessage.append("Something went wrong");
            log.error(logMessage);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/question")
    public ResponseEntity<HttpStatus> deleteQuestionFromId(@RequestParam("parameter") UUID idQuestion) {
        StringBuilder logMessage = new StringBuilder(this.getClass().getName() + " - ");
        try {
            Boolean isDeleted = questionService.deleteQuestion(idQuestion);
            if (isDeleted) {
                logMessage.append("Question Deleted!");
                log.info(logMessage);
                return new ResponseEntity<>(HttpStatus.OK);
            } else {
                logMessage.append("Question not Deleted with id ").append(idQuestion);
                log.info(logMessage);
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
        } catch (Exception e) {
            logMessage.append("Something went wrong");
            log.error(logMessage);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    @RequestMapping(method = RequestMethod.GET, value = "/question")
    public ResponseEntity<List<Question>> getListQuestionFromCategory(@RequestParam String category) {
        StringBuilder logMessage = new StringBuilder(this.getClass().getName() + " - ");
        try {
            // TODO: Lista di tutte le domande per specifica categoria
            logMessage.append("List question returned!");
            log.info(logMessage);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            logMessage.append("Something went wrong");
            log.error(logMessage);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    /** ---------- Gestione Categorie ---------- */

    @RequestMapping(method = RequestMethod.POST, value = "/category", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HttpStatus> saveNewCategory(@RequestParam Category category) {
        StringBuilder logMessage = new StringBuilder(this.getClass().getName() + " - ");
        try {
            // TODO: Salvare una nuova categoria
            logMessage.append("Question correctly saved!");
            log.info(logMessage);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            logMessage.append("Something went wrong");
            log.error(logMessage);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/category")
    public ResponseEntity<HttpStatus> deleteCategory(@RequestParam(name = "category") String category) {
        StringBuilder logMessage = new StringBuilder(this.getClass().getName() + " - ");
        try {
            // TODO: Eliminare una categoria
            logMessage.append("Category correctly deleted!");
            log.info(logMessage);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            logMessage.append("Something went wrong");
            log.error(logMessage);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/allCategory", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HttpStatus> deleteAllCategory(@RequestParam(name = "category") String category) {
        StringBuilder logMessage = new StringBuilder(this.getClass().getName() + " - ");
        try {
            // TODO: Eliminare tutte le categorie
            logMessage.append("All Category correctly deleted!");
            log.info(logMessage);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            logMessage.append("Something went wrong");
            log.error(logMessage);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(method = RequestMethod.POST, value = "/category", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HttpStatus> modifyCategory(@RequestParam Category category) {
        StringBuilder logMessage = new StringBuilder(this.getClass().getName() + " - ");
        try {
            // TODO: Modificare una categoria
            logMessage.append("Category changed correctly!");
            log.info(logMessage);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            logMessage.append("Something went wrong");
            log.error(logMessage);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(method = RequestMethod.GET, value = "/category", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Category>> getListCategory(@RequestParam(name = "category") String category) {
        StringBuilder logMessage = new StringBuilder(this.getClass().getName() + " - ");
        try {
            // TODO: Lista di tutte le categorie disponibili
            logMessage.append("List Category correctly sendend!");
            log.info(logMessage);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            logMessage.append("Something went wrong");
            log.error(logMessage);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    /** ---------- Round ---------- */

    // TODO: Iniziare un nuovo Round su specifica categoria

    // TODO: Mostra un round specifico tramite id

    // TODO: Eliminare un round concluso

    // TODO: Lista di tutti i round di un utente con possibilità di filtrare per
    // categoria

}
