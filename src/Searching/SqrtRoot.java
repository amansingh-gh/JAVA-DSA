package Searching;

public class SqrtRoot {
    static int sqrtRootFind(int n){
            int st =1, end = n/2;
            while(st<=end){
                int mid = st+(end-st)/2;
                if(mid*mid==n) return mid;
                else if (mid*mid>n) end = mid-1;
                else st=mid+1;
            }
            return end;
    }
    static void main() {
        int n = 4;
        int res = sqrtRootFind(n);
        System.out.println("Result is: "+res);
    }
}
