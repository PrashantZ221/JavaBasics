package InterviewProg;

import java.util.Arrays;

public class Anagram {

//Anagram is a word/ sentence that can be rearranged. Eg: elbow = below
    public static void anagram(String one, String two){

        String firstString = one.toLowerCase();
        String secondString = two.toLowerCase();

        char[] firstStringCharArray = firstString.toCharArray();
        Arrays.sort(firstStringCharArray);
        String sortedFirstString = new String(firstStringCharArray);

        //String a = String.valueOf(firstStringCharArray);   Can use this also to convert char to string
        //System.out.println("Used String value of: " + a);

        char[] secondStringCharArray = secondString.toCharArray();
        Arrays.sort(secondStringCharArray);
        String sortedSecondString = new String(secondStringCharArray);

        if(sortedFirstString.equals(sortedSecondString))
            System.out.println("String is anagram");
        else
            System.out.println("String is not anagram");

        //Can compare the char arrays directly
        //if(Arrays.equals(firstStringCharArray, secondStringCharArray))
        //    System.out.println("Char comparison");
    }



    public static void main(String[] args ){
        String one = "Prashant";
        String two = "Tnahsapr";

        anagram(one, two);

    }
}
