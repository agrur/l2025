package lesson15;


import java.io.Reader;
import java.io.StringReader;

public class MarkResetDemo {
    public static void main(String[] args)
    {

        try {

            String str = "Amsterdam is a capital";

            // Create a Reader instance
            Reader reader
                    = new StringReader(str);

            // Get the character
            // to be read from the stream
            int ch;

            // Read the first 10 characters
            // to this reader using read() method
            // This will put the str in the stream
            // till it is read by the reader
            for (int i = 0; i < 9; i++) {
                ch = reader.read();
                System.out.print((char)ch);
            }

            System.out.println();

            // mark the stream for
            // 5 characters using reset()
            reader.mark(8);

            // reset the stream position
            reader.reset();

            // Read the 5 characters from marked position
            // to this reader using read() method
            for (int i = 0; i < 8; i++) {
                ch = reader.read();
                System.out.print((char)ch);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
