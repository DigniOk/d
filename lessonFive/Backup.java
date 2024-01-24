package lessonFive;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Backup {
     public static void main(String[] args) throws IOException {
        // Исходная директория
        File srcDir = new File("C:/Users/ALEX8/OneDrive/Desktop/program/lessonFive/folder");
        // Новая директория для резервного копирования
        File backupDir = new File("C:/Users/ALEX8/OneDrive/Desktop/program/lessonFive/backup");
        backupDir.mkdirs(); // Создаем новую директорию

        // Получаем список всех файлов в исходной директории
        File[] files = srcDir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return !pathname.isDirectory(); // Не включаем поддиректории
            }
        });

        // Копируем каждый файл в новую директорию
        for (File file : files) {
            Path dest = Paths.get(backupDir.getPath(), file.getName());
            Files.copy(file.toPath(), dest, StandardCopyOption.REPLACE_EXISTING);
        }
    }
}
    

