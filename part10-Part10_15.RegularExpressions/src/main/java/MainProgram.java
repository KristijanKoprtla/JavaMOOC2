
import java.util.Scanner;



public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        Checker checker = new Checker();
//        System.out.println(checker.isDayOfWeek("tue"));

        System.out.println("Enter a string: ");
        String input = checker.scanner.nextLine();
        
        if (checker.timeOfDay(input)) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
        checker.scanner.close();
        
        
    }
}
