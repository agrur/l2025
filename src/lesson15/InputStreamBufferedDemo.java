package lesson15;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class InputStreamBufferedDemo {
    public static void main(String[] args) {
        File file = new File("src/lesson15/file1.txt");
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try {

            InputStream is = new FileInputStream(file);
            int nRead;
            byte[] data = new byte[512];

            while ((nRead = is.read(data, 0, data.length)) != -1) {
                buffer.write(data, 0, nRead);
            }
            System.out.println(buffer.toString(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
