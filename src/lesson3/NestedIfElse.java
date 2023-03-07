import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input name, score: ");
        String name = scan.next();
        int score = scan.nextInt();
        char sign;
        if(score >=95 && score <= 100){
            sign = 'A';
        } else if (score >=85 && score < 95) {
            sign = 'B';
        } else if (score >=75 && score < 85) {
            sign = 'C';
        }else if (score >=65 && score < 75) {
            sign = 'D';
        }else if (score >=60 && score < 65) {
            sign = 'E';
        } else sign = 'F';
        System.out.println(name + " " + sign);
    }
}
