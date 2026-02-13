package String;

public class SumOfAllSubstringNumber {
    static void main() {
        String s = "6759";
        int sum=0;
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                sum += Integer.parseInt(s.substring(i,j));
            }
        }
        System.out.println("Sum is: "+sum);
    }
}
