package JAVA.ISK.SEM3;
import java.io.*;
import java.nio.file.FileSystemException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HM {
    public static void main(String[] args) throws IOException {
        try {
            NameRecord();
            System.out.println("success");
        }catch (FileSystemException e){
           System.out.println(e.getStackTrace());

        }
        catch (Exception e){
             System.out.println(e.getMessage());
        }

    }
    public static void NameRecord() throws Exception{
        System.out.println("Через пробел введите фамилию, имя, отчество, дату рождения(dd.mm.yyyy), номер телефона(без пробелов)) и пол(f или m)");
        String MyInfo;
        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            MyInfo = bf.readLine();
        }catch (IOException e){
            throw new Exception("Произошла ошибка при работе с консолью");
        }

        String[] array = MyInfo.split(" ");
        if (array.length != 6){
            throw new Exception("Введено неверное количество параметров");
        }

        String surname = array[0];
        String name = array[1];
        String MiddleName = array[2];

        SimpleDateFormat format = new SimpleDateFormat("dd.mm.yyyy");
        Date birthdate;
        try {
            birthdate = format.parse(array[3]);
        }catch (ParseException e){
            throw new ParseException("Неверный формат даты рождения", e.getErrorOffset());
        }

        int telephone;
        try {
            telephone = Integer.parseInt(array[4]);
        }catch (NumberFormatException e){
            throw new NumberFormatException("Неверный формат телефона");
        }

        String gender = array[5];
        if (!gender.toLowerCase().equals("m") && !gender.toLowerCase().equals("f")){
            throw new RuntimeException("Неверно введен гендер");
        }

        String fileName = "C:\\Users\\ALEX8\\OneDrive\\Desktop\\program\\JAVA\\ISK\\SEM3\\" + surname + ".txt";
        File file = new File(fileName);
        try (FileWriter fileWriter = new FileWriter(file, true)){
            if (file.length() > 0){
                fileWriter.write('\n');
            }
            fileWriter.write(String.format("%s %s %s %s %s %s", surname, name, MiddleName, format.format(birthdate), telephone, gender));
        }catch (IOException e){
            throw new FileSystemException("Возникла ошибка при работе с файлом");
        }

    }
}
//Ivanov Ivan Ivanovich 10.02.1997 6666666 m
//Ivanov Ivan Ivanovich 11.03.0199 5562343 m
//Petrov Ivan Ivanovich 12.04.1997 45467877 m
    

