package String;

public class Strings {
    static void main() {
        String str = "Java is good 🥲🥲";
//        System.out.print(str.charAt(5));
        System.out.println(str);

        StringBuilder strBui = new StringBuilder();
        strBui.append(20);
        strBui.append(20);
        strBui.append(20);

        System.out.println(strBui);


        StringBuffer strBuff = new StringBuffer();
        strBuff.append("Singh is king");
        strBuff.append("Singh is king");

        System.out.println(strBuff);

    }
}
