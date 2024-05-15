package com.ezpoop.ezpoopbackend.exceptions;

import com.ezpoop.ezpoopbackend.domains.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionsHandler {
    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleUserNotFoundException(UserNotFoundException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                ErrorResponse.builder()
                        .httpStatus(HttpStatus.NOT_FOUND)
                        .HttpStatusCode(HttpStatus.NOT_FOUND.value())
                        .message(e.getMessage())
                        .build()
        );
    }
    @ExceptionHandler(UserAlreadyExistsException.class)
    public ResponseEntity<ErrorResponse> handleUserAlreadyExistsException(UserAlreadyExistsException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                ErrorResponse.builder()
                        .httpStatus(HttpStatus.BAD_REQUEST)
                        .HttpStatusCode(HttpStatus.BAD_REQUEST.value())
                        .message(e.getMessage())
                        .build()
        );
    }
}
