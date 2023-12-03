
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ana
 */
public class UserInterface {

    private TodoList todolist;
    private Scanner scanner;

    public UserInterface(TodoList todolist, Scanner scanner) {
        this.todolist = todolist;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }
            if (command.equals("add")) {
                System.out.println("To add: ");
                String todo = scanner.nextLine();
                this.todolist.add(todo);

            }
            if (command.equals("list")) {
                todolist.print();
            }
            if(command.equals("remove")) {
                System.out.println("Which one is removed?");
                int index = Integer.valueOf(scanner.nextLine());
                todolist.remove(index);
            }
        }
    }
}
