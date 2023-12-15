
public class MainProgram {

    public static void main(String[] args) {
        // test your classes here
        Employees university = new Employees();
        university.add(new Person("Mirko", Education.PHD));
        university.add(new Person("Slavko", Education.HS));
        university.add(new Person("Milojko", Education.PHD));

        university.print();

        university.fire(Education.HS);

        System.out.println("==");

        university.print();
    }
}
