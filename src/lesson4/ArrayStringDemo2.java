public class ArrayStringDemo2 {

    public static void main(String[] args) {
        // declaring and initializing an array
        String[] strArray = {"Python", "Java", "C++", "C", "PHP"};

        // Find the length of an array
        int lengthOfArray = strArray.length;

        // using for loop
        for (int i = 0; i < lengthOfArray; i++) {
            System.out.println(strArray[i]);
        }
    }
}
