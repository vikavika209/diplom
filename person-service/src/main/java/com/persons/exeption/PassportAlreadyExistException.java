package com.persons.exeption;

public class PassportAlreadyExistException extends RuntimeException {

    public PassportAlreadyExistException(String passportNumber) {
        super("Паспорт с номером " + passportNumber + " уже существует.");
    }
}
