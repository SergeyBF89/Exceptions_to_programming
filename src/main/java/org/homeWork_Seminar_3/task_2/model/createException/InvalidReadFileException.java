package org.homeWork_Seminar_3.task_2.model.createException;

import java.io.IOException;

public class InvalidReadFileException extends IOException {
    public InvalidReadFileException(String message) {
        super(message);
    }
}
