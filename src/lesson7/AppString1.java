package lesson7;

public class AppString1 {
    public static void main(String[] args) {
        /*-
        String str1 = new String("Welcome");
        String str2 = new String(" to Kyiv");
        String str3 = str1 + str2;
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
        char[] chA = {'A', 'B', 'C', 'D', 'E', 'F', 'H'};
        System.out.println("array length = " + chA.length);
        String str4 = new String(chA);
        System.out.println("str4 = " + str4);
        String str5 = new String(chA, 2, 4); // CDEF
        System.out.println("str5 = " + str5);
        */

		///*-
		String str = "Java Virtual Machine is a heart of Java";
		System.out.println("str length = " + str.length());

		int n = str.indexOf("Java"); // 0
		//int n = str.lastIndexOf("Java"); // 35
		System.out.println("Java n = " + n);
		char c = str.charAt(5); // str[8] not working
		System.out.println("c = " + c);
		//
		String str1 = str.substring(13);
		System.out.println("str1 = " + str1);
		str1 = str1.toUpperCase();
		System.out.println("new str1 = " + str1);
		String str2 = str.substring(5, 13);
		System.out.println("str2 = " + str2);
		//*/
		/*-
		String str = "\t\t   Tabulated  String\t  \n\n\r";
		System.out.println(str);
		str = str.trim();
		System.out.println(str);
		*/
		//
         /*-
        String s1 = new String("Hello");
        String s2 = " And Goodbye";
        String newStr = s1 + s2;
        // str = s1.concat(s2);
        System.out.println("str = " + newStr);
        //
        StringBuilder sb = new StringBuilder(s1);
        sb.append(s2);
        // str = sb.toString();
        System.out.println(" sb = " + sb); // toString()
        System.out.println(" sb.length() = " + sb.length());
        System.out.println(" sb.capacity() = " + sb.capacity());
        sb.append("12345");
        System.out.println("new sb.length() = " + sb.length());
        System.out.println("new sb.capacity() = " + sb.capacity());
        System.out.println("Reverse sb = " + sb.reverse());
        //
        sb.reverse().delete(1, 3);
        System.out.println("after delete sb = " + sb);
        */
    }
}
