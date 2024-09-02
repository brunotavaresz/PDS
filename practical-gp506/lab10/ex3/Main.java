import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        CommandInvoker invoker = new CommandInvoker();

        Command add1 = new AddCommand<>(list, "Hello World");
        Command add2 = new AddCommand<>(list, "Ola Mundo");
        
        invoker.setCommand(add1);
        invoker.executeCommand();
        invoker.setCommand(add2);     
        invoker.executeCommand();

        System.out.println("List after adding two elements:");
        for (String s : list) {
            System.out.println(s);
        }

        invoker.undoCommand();
        System.out.println("\nList after undoing the last command:");
        for (String s : list) {
            System.out.println(s);
        }

    }
}


