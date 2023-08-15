package org.homeWork_Seminar_3.task_2.model.createException;

import java.io.IOException;

public class InvalidCopyFileException extends IOException {
    public InvalidCopyFileException(String message) {
        super(message);
    }
}
