package com.mh.restaoi05.exceotion;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @Override
    protected ResponseEntity<Object>
    handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                 HttpHeaders headers,
                                 HttpStatusCode status,
                                 WebRequest request) {
//        List<FieldError> list = ex.getBindingResult().getFieldErrors();

//        List<String> errorMessage = new ArrayList<>();
//        List<String> errorReason = new ArrayList<>();
//
//        for (FieldError error : list){
//            System.out.println("error.getField() = " + error.getField());
//            System.out.println("error.getDefaultMessage() = " + error.getDefaultMessage());
//            System.out.println("error.getCod() = " + error.getCode());
//            errorMessage.add(error.getCode());
//            errorReason.add(error.getField() + " : " + error.getDefaultMessage());
//        }
//         포문 말고 list에 있느 내용을 스트림으로 출력할 수도 있는데
        List<String> errorMessage = ex.getBindingResult().getFieldErrors().stream()
                .map(error -> error.getCode())
                .collect(Collectors.toList());

        List<String> errorReason = ex.getBindingResult().getFieldErrors().stream()
                .map(e-> e.getField()+" : "+e.getDefaultMessage())
                .collect(Collectors.toList());

        System.out.println("일로오나");
        ErrorResponse response = ErrorResponse.builder()
                .message(errorMessage.toString())
                .reason(errorReason.toString())
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }
}
