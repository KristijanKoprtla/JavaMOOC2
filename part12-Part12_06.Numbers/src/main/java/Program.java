
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many random numbers should be printed? ");
        int value = Integer.valueOf(scanner.nextLine());
        Random randomValue = new Random();
        
        for(int i = 0; i < value ; i++) {
            int randomNumber = randomValue.nextInt(11);
            System.out.println(randomNumber);
        }
    }

}
