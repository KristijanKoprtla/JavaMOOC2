
import java.util.Scanner;



public class Checker {
    Scanner scanner = new Scanner(System.in);
    
    public boolean isDayOfWeek(String string){
        String regex = "(mon|tue|wed|thu|fri|sat|sun)";
        if(string.matches(regex)) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean allVowels(String string){
        String regex = "^[aeiou]+$";
        return string.matches(regex);
        
    }
    
    public boolean timeOfDay(String string) {
        String regex = "^(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d$";
        return string.matches(regex);
    }
    
    
}
