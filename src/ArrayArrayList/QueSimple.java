package ArrayArrayList;

public class QueSimple {
    static void main() {
        int[] arr ={2,4,6,9,10};
//       Multiply odd index by 2 and even by 10
        for(int i=0; i<arr.length; i++){
            if((i+1)%2==0){
                arr[i] +=10;
            }else{
                arr[i]*=2;
            }
        }
        System.out.println("Numbers are: ");
        for(int x: arr){
            System.out.print(x+" ");
        }

    }
}
