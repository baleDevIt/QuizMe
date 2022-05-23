package it.gbale.quizme.Service;

import it.gbale.quizme.Entity.Round;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RoundService {

    /**
     * Restituisce un nuovo oggetto round che con è altro che la somma delle domande
     * di ogni partita con altre informazioni
     */
    public Round newRound(UUID idCategory) {
        // TODO: Restitusce un nuovo round
        return null;
    }
}
