package InterviewProg;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String duplicateCharRemoved = removeDuplicateChar("Testing in progress");
        System.out.println(duplicateCharRemoved);
    }

    public static String removeDuplicateChar(String s1) {
        String duplicateCharRemoved = "";
        Set<Character> uniqueCharSet = new HashSet<>();
        char[] s2 = s1.toLowerCase().toCharArray();
        for(char ch: s2) {
            if(!(ch==' '))
                uniqueCharSet.add(ch);
        }
        for(char ch : uniqueCharSet) {
            duplicateCharRemoved = duplicateCharRemoved+ch;
        }

        String test = String.valueOf(uniqueCharSet);
        System.out.println("Test: " + test);  //Test: [p, r, s, t, e, g, i, n, o]
        return duplicateCharRemoved;
    }
}
