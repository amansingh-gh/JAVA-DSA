package BasicMaths;

import java.util.Scanner;

public class CountNumbers {
    public static int countNum(int n){
        int count = 0;
        while(n>0){
            count+=1;
            n/=10;    
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int res = countNum(n);
        System.out.println("Total count of numbers are:: "+res);

    }
}
