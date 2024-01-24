package lessonFive;
import java.io.FileOutputStream;
import java.io.IOException;

public class Byte {
    public static void main(String[] args) throws IOException {
        int[] numbers = {0, 1, 2, 3, 0, 1, 2, 3, 0}; // числа
        byte[] bytes = new byte[numbers.length * 3]; // Массив для байт

        // Преобразование каждого числа в байт и добавление его в массив
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            bytes[i*3] = (byte)(num & 0xFF);
            bytes[i*3 + 1] = (byte)((num >> 8) & 0xFF);
            bytes[i*3 + 2] = (byte)((num >> 16) & 0xFF);
        }

        // Запись массива байт в файл
        try (FileOutputStream fos = new FileOutputStream("C:/Users/ALEX8/OneDrive/Desktop/program/lessonFive/output.bin")) {
            fos.write(bytes);
        }
    }
}
