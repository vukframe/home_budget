package vu.che.shell.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import vu.che.utils.exceptions.ResourceNotFoundException;
import vu.che.utils.web.Message;
import vu.che.utils.web.Response;

@ControllerAdvice
public class ResourceNotFoundExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = ResourceNotFoundException.class)
    protected ResponseEntity<Object> handleResourceNotFound(RuntimeException ex, WebRequest request) {
        Message message = new Message("resource.not_found", "Resource could not be found");
        return handleExceptionInternal(ex, new Response<>(message), new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }
}
