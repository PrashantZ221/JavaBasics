package InterviewProg;

import java.util.HashSet;
import java.util.Set;

public class MaxTotal {
    public static int calculateUniqueTotal(String input) {

        //Need to remove the opening and closing braces
        String finalInput = input.substring(1, input.length()-1);

        // Split the input string by commas and spaces
        String[] numbers = finalInput.split(",\\s*");

        // Create a set to store unique numbers
        Set<Integer> uniqueNumbers = new HashSet<>();

        // Iterate through each number
        for (String number : numbers) {
            try {
                // Parse the number to integer
                int num = Integer.parseInt(number);
                // Add the number to the set
                uniqueNumbers.add(num);
            } catch (NumberFormatException ignored) {
                // Ignore non-integer inputs
            }
        }

        // Calculate the sum of unique numbers
        int sum = 0;
        for (int num : uniqueNumbers) {
            sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {
        // Test cases
        String input1 = "{1,2,3,1,2}";
        String input2 = "{1,,2,a,3,3}";

        // Calculate and print the total of all unique numbers for each input
        System.out.println("Output for " + input1 + ": " + calculateUniqueTotal(input1));
        System.out.println("Output for " + input2 + ": " + calculateUniqueTotal(input2));
    }
}
