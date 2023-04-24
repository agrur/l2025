package lesson12;



public class MyString {
    private  char[] str; // Chars of string
    private int hash; // Default to 0


    public static void main(String[] args) {
        String str = "ab";
        System.out.println(str.hashCode());
    }

    ///*-
    public int hashCode() {
        // Check if the hash has already been computed
        if (this.hash != 0 || this.str.length == 0) {
            return this.hash;
        }
        // Hasn’t been computed, compute and store
        for (int i = 0; i < this.str.length; i++) {
            this.hash = 31 * this.hash + this.str[i];
        }
        return this.hash;
    }
    //*/

}
