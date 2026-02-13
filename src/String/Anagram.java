package String;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    static boolean checkAnagram(String m, String n){
        if(m.length()!=n.length()) return false;
        char[] c1 = m.toCharArray();
        char[] c2 = m.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        for(int i=0; i<c1.length; i++){
            if(c1[i]!=c2[i]) return false;
        }
        return true;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        String m = sc.next();
        String n = sc.next();

        System.out.println(checkAnagram(m,n));

    }
}
