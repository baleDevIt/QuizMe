package it.gbale.quizme.Exception;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
@Log4j2
public class RestResponceEntityExeptionHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMissingServletRequestParameter(MissingServletRequestParameterException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
            StringBuilder logMessage = new StringBuilder(LogLevel.ERROR + " - " + this.getClass().getName() + " - ");
            logMessage.append(ex.getMessage());
            log.error(logMessage);
            return new ResponseEntity<Object>(StandardExceptionResponce.builder().message(ex.getMessage()).statusError(status).codeError(String.valueOf(status.value())).build(),headers,status);

    }
}