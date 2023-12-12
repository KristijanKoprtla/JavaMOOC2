
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> words = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }
            words.add(input);
        }
        String printWords = words.stream()
                .reduce("",(prevString, word) -> prevString + word + "\n");
        System.out.println(printWords);
    }
}
