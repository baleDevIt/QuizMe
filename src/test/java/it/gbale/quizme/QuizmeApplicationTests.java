package it.gbale.quizme;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import it.gbale.quizme.Entity.Question;
import it.gbale.quizme.Service.QuestionService;

@SpringBootTest
class QuizmeApplicationTests {

	@Autowired
	QuestionService service;

	@Test
	void contextLoads() {
	}
}
