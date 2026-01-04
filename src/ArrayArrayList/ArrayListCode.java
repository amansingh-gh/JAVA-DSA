package ArrayArrayList;

import java.util.ArrayList;
import java.util.Scanner;

class ArrayListCode {

    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] roll = new int[500];

        int[][] rolls = new int[3][3];
        for (int i = 0; i < rolls.length; i++) {
            for (int j = 0; j < rolls.length; j++) {
                System.out.print("Enter [" + i + "]" + "[" + j + "]: ");
                rolls[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rolls.length; i++) {
            for (int j = 0; j < rolls.length; j++) {
                System.out.print(rolls[i][j] + " ");
            }
            System.out.println();
        }
//ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        for (String str : list) {
            System.out.println("Items are: " + str);
        }
    }
}
