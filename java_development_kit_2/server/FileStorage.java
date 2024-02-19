package java_development_kit_2.server;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileStorage implements ServerRepository{
    public static final String LOG_PATH = "src/main/java/server/log.txt";
    public String getFileName(){ return LOG_PATH;}
    public String getHistory() {
        return readLog();
    }
    public void completeHistory(String text){
        writeLog(text);
    }
    private void writeLog(String text){
        try (FileWriter writer = new FileWriter(LOG_PATH, true)){
            writer.write(text);
            writer.write("\n");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    private String readLog() {
        try (FileReader fr = new FileReader(LOG_PATH)){
            String lines = "";
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                lines += line + '\n';
            }
            br.close();
            return lines;
        } catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }
}
