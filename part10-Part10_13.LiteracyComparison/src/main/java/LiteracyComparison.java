
import java.nio.file.Files;
import java.nio.file.Paths;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .sorted((a,b) -> a[5].compareTo(b[5]))
                    .forEach(row -> System.out.println(row[3] + " (" + row[4] + "), " + row[2].split(" ")[1].trim() + ", " + row[5]));
            
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
