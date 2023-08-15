package org.homeWork_Seminar_3.task_2;

import org.homeWork_Seminar_3.task_2.model.FileManagerController;
import org.homeWork_Seminar_3.task_2.model.createException.InvalidCopyFileException;
import org.homeWork_Seminar_3.task_2.model.createException.InvalidReadFileException;
import org.homeWork_Seminar_3.task_2.model.createException.InvalidRecordFileException;

public class Main {
    public static void main(String[] args) throws InvalidCopyFileException, InvalidRecordFileException,
            InvalidReadFileException {
        FileManagerController fileManagerController = new FileManagerController();
        fileManagerController.startFileManager();
    }


}
