package com.Anmol.student._management.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionalHandler {
    @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<String> handleStudentNotFound(StudentNotFoundException ex) {

        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}
