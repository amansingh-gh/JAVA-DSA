package ArrayArrayList;

public class PalindromicArray {
    public static boolean isPalinArray(int[] arr) {
        for(int i: arr){
            if(!palindrome(i)) return false;
        }
        return true;
    }

    public static boolean palindrome(int x){
        int originalX = x;
        int rev = 0;
        while(x>0){
            int digit = x%10;
            rev = (rev*10) + digit;
            x /= 10;
        }
        return rev == originalX;
    }

    static void main() {
        int[] arr = {111,222,333,444,555};
        System.out.println(isPalinArray(arr));
    }
}