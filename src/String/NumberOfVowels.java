package String;

import java.lang.Character;

public class NumberOfVowels {
    static void main() {
        int count = 0;
        String strs = "aeioukmpla";
        for(int i=0; i<strs.length(); i++){
            int ch = Character.toLowerCase(strs.charAt(i));
            if(ch=='a'||ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                count++;
            }
        }
        System.out.println("Total vowels count are: "+count);
    }
}
