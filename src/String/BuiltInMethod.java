package String;

import java.util.Scanner;

public class BuiltInMethod {
    static void main() {
        String s = "heysinghamSSFWn";
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.contains("sS"));
        System.out.println(s.startsWith("hey"));
        s.concat("HURRRR");
        System.out.println(s);


//        Compare to String
        String a = "Harush";
        String b = "NOMOT";
        System.out.println(b.compareTo(a));

//        Concatinate string
        String xy = "Singh";
        String zz = "Aman";
        String res = zz.concat(xy);
        System.out.println(res);



//        int to string
        System.out.println("Enter number to change into string");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String nn = Integer.toString(n);
        System.out.println(nn);
    }
}