package InterviewProg;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//Methods used - filter(name -> name.startsWith("A"), map(n -> n*n), distinct(), count(), sorted(), .reduce(Integer::sum)

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Filter names starting with 'A' and collect them into a new list
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(filteredNames); // Output: [Alice]

        //-----------------------------------------------------------

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        // Output: [1, 4, 9, 16, 25]

        //-----------------------------------------------------------

        List<String> names3 = Arrays.asList("Alice", "Bob", "Charlie", "David");
        List<String> sortedNames = names3.stream()
                .sorted()
                .collect(Collectors.toList());
        // Output: [Alice, Bob, Charlie, David]

        //-----------------------------------------------------------

        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 2, 5, 3);
        List<Integer> uniqueNumbers = numbers2.stream()
                .distinct()
                .collect(Collectors.toList());
        // Output: [1, 2, 3, 4, 5]

        //-----------------------------------------------------------

        List<String> names4 = Arrays.asList("Alice", "Bob", "Charlie", "David");
        names4.stream()
                .forEach(System.out::println);
        // Output:
        // Alice
        // Bob
        // Charlie
        // David

        //-----------------------------------------------------------

        List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> sum = numbers5.stream()
                .reduce(Integer::sum);
        // Output: 15

        //-----------------------------------------------------------
        List<String> names6 = Arrays.asList("Alice", "Bob", "Charlie", "David");
        long count = names6.stream()
                .count();
        // Output: 4

    }
}
