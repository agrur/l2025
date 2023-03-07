package lesson3;

class BlockDemo {

    public static void main(String[] args) {
        int x = 10;
        BlockDemo objBlockDemo = new BlockDemo();
        objBlockDemo.method(x);

        {
            int z = ++x;
            System.out.println(z);
        }
        System.out.println(x);
    }

    private void method(int x) {
        int y = ++x;
        System.out.println(y);
    }
}
