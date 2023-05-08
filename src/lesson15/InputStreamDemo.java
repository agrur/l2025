package lesson15;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class InputStreamDemo {
    public static void main(String[] args) {
        File file = new File("src/lesson15/file1.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader reader = new InputStreamReader(fis, StandardCharsets.UTF_8);
            int b = 0;
            while ((b=reader.read()) != -1){
                System.out.println((char) b);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
