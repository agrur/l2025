public class UseString {
    public static void main(String[] args) {
        String s1 = "JVM is a heart of Java";
        String s2 = "Welcome";
        char[] s3 = {'W', 'e', 'l', 'c', 'o', 'm', 'e'};

        String[] word = s1.split(" ");

        for (String str :   word ) {
            System.out.println(str);
        }

//        for (char i : s2) {
//            System.out.println(i);
//        }

        System.out.println(s1.toUpperCase());
        System.out.println(s2);
        System.out.println(String.valueOf(s3));


    }
}
