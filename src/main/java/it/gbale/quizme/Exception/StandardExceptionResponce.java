package it.gbale.quizme.Exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StandardExceptionResponce{

    String codeError;
    HttpStatus statusError;
    String message;

}
