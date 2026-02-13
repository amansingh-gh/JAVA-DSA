package String;

public class Palindrome {
    public static boolean chkPalindrome(String str){
        int st=0, end= str.length()-1;
        while(st<end){
            if(str.charAt(st) != str.charAt(end)){
                return false;
            }
            st++; end--;
        }
        return true;
    }
    static void main() {
        String str = "mom";
        Boolean res = chkPalindrome(str);
        System.out.println(res);
    }
}
