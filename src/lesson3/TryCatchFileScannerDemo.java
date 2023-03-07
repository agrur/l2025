import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatchFileScannerDemo {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(new File("test.txt"));
            while (scan.hasNext()){
                System.out.println(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
          //  System.out.println("FileNotFoundException");
        }
    }
}
