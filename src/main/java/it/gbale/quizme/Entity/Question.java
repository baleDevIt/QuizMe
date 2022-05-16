package it.gbale.quizme.Entity;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Question {

    @Id
    private UUID id;
    private String question;
    private Map<String, String> checkingAnswer;
    private List<String> answer;
    private String explanation;
    private URL url;
    private List<String> category;
}
