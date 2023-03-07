public class DataTypes {
    static final double MY_PI = 3.141592653;
    public static void main(String[] args) {
        boolean numBoolean = true;
        byte numByte = 0x7a;
        char numCharacter = 'A';
        int numInt = 0b1010;
        short   numShort = 101;
        long numLong = 65536L;
        float numFloat = 3.141592F;
        double numDouble = 3.141592653D;

        System.out.println("byte: " + Byte.MIN_VALUE + "  " + Byte.MAX_VALUE + " bytes=" + Byte.BYTES);
        System.out.println("byte: " + Character.MIN_VALUE + "  " + Character.MAX_VALUE + " bytes=" + Character.BYTES);
        System.out.println("int: " + Integer.MIN_VALUE + "  " + Integer.MAX_VALUE + " bytes=" + Integer.BYTES);
        System.out.println("short: " + Short.MIN_VALUE + "  " + Short.MAX_VALUE + " bytes=" + Short.BYTES);
        System.out.println("long: " + Long.MIN_VALUE + "  " + Long.MAX_VALUE + " bytes=" + Long.BYTES);
        System.out.println("float: " + Float.MIN_VALUE + "  " + Float.MAX_VALUE + " bytes=" + Float.BYTES);
        System.out.println("double: " + Double.MIN_VALUE + "  " + Double.MAX_VALUE + " bytes=" + Double.BYTES);

        System.out.println(numBoolean);
        System.out.println(numByte);
        System.out.println(numCharacter);
        System.out.println(numInt);
        System.out.println(numShort);
        System.out.println(numLong);
        System.out.println(numFloat);
        System.out.println(numDouble);

        System.out.println("MY_PI=" + MY_PI);
    }
}
