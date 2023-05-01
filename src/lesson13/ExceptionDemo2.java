package lesson13;

import java.io.*;

public class ExceptionDemo2 {
    public static void main(String args[])  {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("src/lesson13/myfile.txt"));
            String data = null;

            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
        } catch (EOFException dio) {
            System.out.println("EOFException");
            dio.printStackTrace();

        } catch (IOException ioe) {
            System.out.println("IOException");
            ioe.printStackTrace();


        } finally {
//            if(br !=null){
//                try {
//                    br.close();
//                } catch (IOException e) {

                    System.out.println("Run Finally");
//                    e.printStackTrace();
                }
            }
        }


