package ArrayArrayList;

class Wrap{
    int value = 5;
}

public class ArrayPassByValue{
    static void modify(Wrap obj){
        obj.value = obj.value+10;
    }
    public static void main(String[] args) {
        Wrap w = new Wrap();
        modify(w);
        System.out.println(w.value);
    }
}