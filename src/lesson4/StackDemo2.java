

public class StackDemo2 {
    public static void main(String[] args) {
        int i = 1;
        Object obj1 = new Object();
        StackDemo2 obj2 = new StackDemo2();
        obj2.exMethod(obj1);

    }

    private void exMethod(Object param) {
        String str1 = param.toString();
        System.out.println(str1);
    }
}
