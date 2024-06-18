package InterviewProg;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Find the number of Error, Info and Warning after the date

public class FindErrorCountInString {
    public static void main(String[] args) {
        String input = "11/8/2022 ERROR wow message such as ERROR long\n" +
                "11/18/2022 INFO wow message such as ERROR long\n" +
                "11/19/2022 WARNING wow message such as ERROR long\n" +
                "11/19/2022 ERROR wow message such as ERROR long";

        String wordToCount = "ERROR";

        long count = getCountAfterDate(input, wordToCount);
        System.out.println("Total count of '" + wordToCount + "' after any date format: " + count);
    }

    private static long getCountAfterDate(String input, String wordToCount) {
        String regex = "\\d{1,2}/\\d{1,2}/\\d{4}\\s+" + wordToCount;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        long count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

}
