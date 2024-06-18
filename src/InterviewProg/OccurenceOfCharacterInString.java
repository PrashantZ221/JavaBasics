package InterviewProg;

import java.util.HashMap;
import java.util.Map;


//Get count of each character in a string

public class OccurenceOfCharacterInString {
    public static void main(String[] args) {
        String s1 = "My name is Prashant";

        HashMap<Character, Integer> hs = new HashMap();
        char[] ch = s1.toCharArray();
        for(char c: ch) {
            if(c!=' ')
                hs.put(c, hs.getOrDefault(c,0)+1);
        }

        System.out.println("Hashset directly: "+hs);

        for(Map.Entry<Character, Integer> hs1: hs.entrySet()){
            System.out.println(hs1.getKey() + ":" + hs1.getValue());
        }
    }
}
