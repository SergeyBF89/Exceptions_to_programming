package org.homeWork_Seminar_3.task_2.model;

/**
 * Команды файл менеджера доступные для работы с файлами:
 * cop - копирование файла
 * rec - запись файла
 * read - чтение файла
 * exit - выход
 */
public interface Commands {
    String CopyFile = "cop";
    String RecordFile = "rec";
    String ReadFile = "read";
    String Exit = "exit";
}
