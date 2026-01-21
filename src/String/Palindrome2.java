package String;

public class Palindrome2 {
    public static boolean chkPalindrome(String str){
        StringBuffer sb = new StringBuffer();

        sb.append(str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase());
        int st=0, end = sb.length()-1;
        System.out.println(sb);
        while (st<end){
            if(sb.charAt(st)!=sb.charAt(end)){
                return false;
            }
            st++; end--;
        }
        return true;
    }
    static void main() {
        String str = "A-man a plan a canal Panama";
        Boolean res = chkPalindrome(str);
        System.out.println(res);
    }
}