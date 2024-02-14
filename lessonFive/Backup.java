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
        File folder = new File("C:/Users/ALEX8/OneDrive/Desktop/program/lessonFive/folder");
        File backup = new File("C:/Users/ALEX8/OneDrive/Desktop/program/lessonFive/backup");
        backup.mkdirs();
        File[] files = folder.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return !pathname.isDirectory();
            }
        });
        for (File file : files) {
            Path del = Paths.get(backup.getPath(), file.getName());
            Files.copy(file.toPath(), del, StandardCopyOption.REPLACE_EXISTING);
        }
    }
}
    

