package org.homeWork_Seminar_3.task_2.model;

import org.apache.commons.io.FileUtils;
import org.homeWork_Seminar_3.task_2.model.createException.InvalidCopyFileException;
import org.homeWork_Seminar_3.task_2.model.createException.InvalidReadFileException;
import org.homeWork_Seminar_3.task_2.model.createException.InvalidRecordFileException;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileManager {
    private String currentFolder;

    public FileManager(String currentFolder) {
        this.currentFolder = currentFolder;
    }

    /**
     * Метод копирования файла
     * @param sourceFile - Указывает название файла, который нужно скопировать
     * @param destFile - Указывает название файла, в который будет скопирован
     * @throws InvalidCopyFileException - Ошибка не правильной работы с копированием файла
     */
    public void copyFile(String sourceFile, String destFile) throws InvalidCopyFileException {
        File source = new File(currentFolder + "\\" + sourceFile);
        File dest = new File(currentFolder + "\\" + destFile);
        try {
            FileUtils.copyFile(source, dest);
        } catch (IOException e) {
            throw new InvalidCopyFileException("Невозможно копирование файла!");
        }
    }

    /**
     * Метод записи файла
     * @param fileName - Название нового файла
     * @throws InvalidRecordFileException - Ошибка не правильной работы с записью файла
     */
    public void recordFile(String fileName) throws InvalidRecordFileException {
        File file = new File(currentFolder + "\\" + fileName);
        try {
            file.createNewFile();
        }catch (IOException e) {
            throw new InvalidRecordFileException("Запись файла невозможна!");
        }
    }

    /**
     * Метод чтения файла
     * @param fileName - Название файла для чтения
     * @throws InvalidReadFileException - Ошибка не правильной работы с чтением файла
     */
    public  void readFile(String fileName) throws InvalidReadFileException {
        File file = new File(currentFolder + "\\" + fileName);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            throw new InvalidReadFileException("Чтение файла не возможно!");
        }
    }
}
