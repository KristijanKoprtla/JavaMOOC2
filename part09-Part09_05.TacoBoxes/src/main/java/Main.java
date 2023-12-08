
public class Main {

    public static void main(String[] args) {
        // Test your code here!
        TripleTacoBox tacos = new TripleTacoBox();
        System.out.println(tacos.tacosRemaining());
        tacos.eat();
        System.out.println(tacos.tacosRemaining());
        tacos.eat();
        tacos.eat();
        tacos.eat();
        System.out.println(tacos.tacosRemaining());
    }
}
