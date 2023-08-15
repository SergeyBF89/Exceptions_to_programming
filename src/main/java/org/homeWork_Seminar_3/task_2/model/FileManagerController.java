package org.homeWork_Seminar_3.task_2.model;

import org.homeWork_Seminar_3.task_2.model.createException.InvalidCopyFileException;
import org.homeWork_Seminar_3.task_2.model.createException.InvalidReadFileException;
import org.homeWork_Seminar_3.task_2.model.createException.InvalidRecordFileException;

import java.util.Scanner;

public class FileManagerController {
    Scanner scanner = new Scanner(System.in);
    private final FileManager fileManager = new FileManager("C:\\lessons\\Java\\Exceptions_of_programming\\src" +
            "\\main\\java\\org\\homeWork_Seminar_3\\task_2.txt");
    private String input = scanner.nextLine();

    public void startFileManager() throws InvalidReadFileException, InvalidRecordFileException, InvalidCopyFileException {
        while (!input.equals(Commands.Exit)) {
            String[] tokens = input.split(" ");
            String command = tokens[0];

            switch (command) {
                case Commands.CopyFile -> {
                    String sourceFile = tokens[1];
                    String destFile = tokens[2];
                    fileManager.copyFile(sourceFile, destFile);
                }
                case Commands.RecordFile -> {
                    String fileName = tokens[1];
                    fileManager.recordFile(fileName);
                }
                case Commands.ReadFile -> {
                    String fileName = tokens[1];
                    fileManager.readFile(fileName);
                }
            }
            input = scanner.nextLine();
        }
    }
}
