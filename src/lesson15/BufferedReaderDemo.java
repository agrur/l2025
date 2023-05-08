package lesson15;

import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException
    {
        //створюємо String data
        StringBuilder sb = new StringBuilder();
        sb.append("Warsaw").append('\n');
        sb.append("Amsterdam").append('\n');
        sb.append("Kyiv").append('\n');
        String data = sb.toString();

        //Обгортаємо data в клас ByteArrayInputStream
        InputStream is = new ByteArrayInputStream(data.getBytes());

        //підміняємо in
        System.setIn(is);

        //викликаємо метод, який "нічого не знає" про маніпуляції
        readAndPrintLine();
    }

    public static void readAndPrintLine() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        while (true)
        {
            String line = reader.readLine();
            if (line == null) break;
            System.out.println(line);
        }
        reader.close();
        isr.close();
    }
}
