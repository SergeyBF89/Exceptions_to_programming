package org.homeWork_Seminar_3.task_2.model.createException;

import java.io.IOException;

public class InvalidRecordFileException extends IOException {
    public InvalidRecordFileException(String message) {
        super(message);
    }
}
