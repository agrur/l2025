public class ReturnArrayFromMethod {



    public static void main(String[] args) {
        // declaring and initializing an array
        int[] myArray = {1, 2, 3, 4, 5};

        // call function by passing array in it
        int[] multiplyArr = doMultiplication(myArray);
        // print array
        System.out.println("Array multiply by 2 is - ");
        for (int i : multiplyArr) {
            System.out.print(i + " ");
        }
    }

    public static int[] doMultiplication(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
        return arr;
    }
}
