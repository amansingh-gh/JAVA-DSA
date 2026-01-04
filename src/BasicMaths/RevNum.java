package BasicMaths;

import java.util.Scanner;

public class RevNum {
    static int revNums(int n){
        int revNum=0;
        while(n>0){
            int rem = n%10;
            revNum = (revNum*10)+rem;
            n=n/10;
        }
        System.out.println("Reverse number 1 is: "+revNum);
        return revNum;
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       int res =  revNums(num);
        System.out.println("Reverse number 2 is: "+res);
    }
}
