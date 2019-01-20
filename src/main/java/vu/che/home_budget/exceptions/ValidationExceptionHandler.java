package vu.che.home_budget.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import vu.che.utils.exceptions.ValidationException;
import vu.che.utils.web.Message;
import vu.che.utils.web.Response;

import java.util.List;

@ControllerAdvice
public class ValidationExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = ValidationException.class)
    protected ResponseEntity<Object> handleResourceNotFound(RuntimeException ex, WebRequest request) {
        List<Message> errorMessages = ((ValidationException) ex).getMessages();
        return handleExceptionInternal(ex, new Response<>(errorMessages), new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }
}
