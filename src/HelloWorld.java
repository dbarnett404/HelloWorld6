import java.util.Scanner;

//CLasses start with an upper case / capital letter
public class HelloWorld {
    //THis is a field of the class HelloWorld
    private String name;

    //Methods start with a lower case letter
    //Class and method names use camel case
    public String getName() {
        //Scanner is a class
        //scanner is the name of the object
        //new makes a new instance of the class or a new object
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is ");
        System.out.println("your name?");
        //nextLine returns whatever the user types up until they
        // press the return / enter key on the keyboard
        name = scanner.nextLine();
        return name;
    }
}
