
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String inputNum = scanner.nextLine();
            if(inputNum.equals("end")) {
                break;
            }
            int number = Integer.valueOf(inputNum);

            System.out.println(number * number * number);
        }

    }
}
