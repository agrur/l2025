public class ExplicitDataConvert {
    public static void main(String[] args) {

        double numDouble = 1_000_000_000D;

        int numInteger = (int) numDouble;
        short numShort = (short) numDouble;
        long numLong = (long) numDouble;
        float numFloat = (float) numDouble;




        System.out.println(numInteger);
        System.out.println(numShort);
        System.out.println(numLong);
        System.out.println(numFloat);
        System.out.println(numDouble);


    }
}
