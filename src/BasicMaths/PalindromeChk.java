package BasicMaths;

import java.util.Scanner;

public class PalindromeChk {
    static Boolean chkPalindrome(int n){
        int dupli = n;
        int revNum = 0;
        while(n>0){
            int rem = n%10;
            revNum = revNum*10+rem;
            n = n/10;
        }
        if(dupli!=revNum){
            return false;
        }
        return true;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Boolean res = chkPalindrome(n);
        if (res) {
            System.out.println("Yes");
        }else  {
            System.out.println("No");
        }

    }
}
