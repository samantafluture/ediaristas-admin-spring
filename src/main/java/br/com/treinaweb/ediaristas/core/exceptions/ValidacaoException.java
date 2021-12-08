package br.com.treinaweb.ediaristas.core.exceptions;

import org.springframework.validation.FieldError;

public class ValidacaoException extends RuntimeException {

    private FieldError fieldError; // connect to the field error fom Bean Validation

    public ValidacaoException(String message, FieldError fieldError) {
        super(message);
        this.fieldError = fieldError;
    }

    public FieldError getFieldError() {
        return fieldError;
    }

}
