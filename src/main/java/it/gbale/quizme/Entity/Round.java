package it.gbale.quizme.Entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

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
public class Round {
    private LocalDateTime dataInizio;
    private LocalDateTime dataFine;
    private Boolean roundIsFinish;

    private Player userPlayer;
    private String category;

    private List<UUID> stockQuestionTotal;
    private List<UUID> stockCorrect;
    private List<UUID> stockIncorrect;
    private List<UUID> stockNotResponded;

    private Integer score;
}
