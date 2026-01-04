package ArrayArrayList;

public class SwapPassByVlaue {
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);
    }
    static void main() {
    int a = 20;
    int b = 50;
    swap(a,b);
        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);
    }
}