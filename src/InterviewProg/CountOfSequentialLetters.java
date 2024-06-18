package InterviewProg;

import java.util.HashMap;
import java.util.Map;

public class CountOfSequentialLetters {
    public static void main(String[] args) {
        String input = "aabbbdddd";

        char[] chInput = input.toCharArray();
        HashMap<Character, Integer> hmInput = new HashMap<Character, Integer>();

        for(char ch: chInput) {
            hmInput.put(ch, hmInput.getOrDefault(ch, 0)+1);
        }

        //System.out.println(hmInput.toString());
        String output = "";

       for(Map.Entry<Character, Integer> me : hmInput.entrySet()){
           output = output + me.getKey();
           output = output + String.valueOf(me.getValue());
       }
        System.out.println("Final output:" + output);


    }
}
