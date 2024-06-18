package InterviewProg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringContainsOnlyDigits {
    public static void main(String[] args) {
        String s1 = "21231312312";

        Pattern pattern = Pattern.compile("\\d");   //To find only letters : \\p{Alpha}
        Matcher matcher = pattern.matcher(s1);

        int count = 0;
        while (matcher.find()) {
            count++;
        }
        if(s1.length()==count)
            System.out.println("Given string contain only digits: "+count);
        else
            System.out.println("Given string contain non digits and count is "+ (s1.length() - count));

        //------------------------------------------------------------------
        Pattern pattern2 = Pattern.compile("[abc]");
        Matcher matcher2 = pattern2.matcher("abcddddd");
        int count2 = 0;
        while (matcher2.find()) {
            count2++;
        }
        System.out.println("Count: "+count2);  //Count is 3

    }


    //This program can also be done using Character.isDigit(char c) method
}
