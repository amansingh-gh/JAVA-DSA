package String;

public class PrintSubStrings {
    static void main() {
        String str = "aman";
        int end = str.length();
        for(int i=0; i<end; i++){
            for(int j=i+1; j<=end; j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
}
