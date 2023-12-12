
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String word = scanner.nextLine();
            if (word.equals("end")) {
                break;
            }
            int number = Integer.valueOf(word);
            numbers.add(number);
        }

        List<Integer> positiveValues = positive(numbers);
        System.out.println("Positive numbers: " + positiveValues);

    }

    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream()
                .filter(value -> value > 0)
                .collect(Collectors.toList());

    }
}
