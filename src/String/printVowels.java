package String;

import java.lang.Character;

public class printVowels {
    public static String findVowels(String str){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<str.length(); i++){
             char ch = Character.toLowerCase(str.charAt(i));
             if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u'){
                 stringBuilder.append(ch);
             }
        }
        return stringBuilder.toString();
    }
    static void main() {
        String str = "sdfoiuasidfnsdjaoisdhunxzouERasdczxjcvixcv";
        System.out.println(findVowels(str));
    }
}
