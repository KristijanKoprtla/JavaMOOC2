
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String word = scanner.nextLine();
            if (word.equals("end")) {
                break;
            }

            numbers.add(Integer.valueOf(word));

        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String letter = scanner.nextLine();
        if (letter.equals("n")) {
            System.out.println("Average of the negative numbers: " + numbers.stream()
                    .mapToInt(i -> i)
                    .filter(number -> number < 0)
                    .average()
                    .getAsDouble());
        }
        if(letter.equals("p")) {
            System.out.println("Average of the positive numbers: " + numbers.stream()
                    .mapToInt(i -> i)
                    .filter(number -> number > 0)
                    .average()
                    .getAsDouble());
        }
    }
}
