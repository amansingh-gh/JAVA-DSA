package String;

public class toChange {
    static void change(String x){
        x = "Sumit";
    }
    static void main() {
        String x = "Jooom";
        System.out.println("Before change: "+x);
        change(x);
        System.out.println("After change: "+x);
    }
}