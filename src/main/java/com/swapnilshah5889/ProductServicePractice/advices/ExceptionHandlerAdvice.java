package com.swapnilshah5889.ProductServicePractice.advices;

import com.swapnilshah5889.ProductServicePractice.DTOs.ExceptionResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<ExceptionResponseDTO> handleArithmeticException() {
        ExceptionResponseDTO responseDTO = new ExceptionResponseDTO();
        responseDTO.setMessage("Something went wrong");
        responseDTO.setDetails("Arithmetic Exception Details");
        return new ResponseEntity<>(responseDTO, HttpStatus.BAD_REQUEST);
    }
}
