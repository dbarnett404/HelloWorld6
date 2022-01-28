//This is the main class
public class Main {
    //THis is the main method
    //We always have a main class and a main method
    //public is an access modifier - it specifies the visibility of a method
    //static means the method can be used without creating an object
    //void is the return type of a method
    public static void main(String[] args) {
        //THis prints to the console
        //THe words inside the speech marks are called a String
        System.out.println("Hello world!");

        HelloWorld helloWorld = new HelloWorld();
        String name = helloWorld.getName();
        System.out.println("Hello " + name);
        //Variables!
        //Java has 8 primitive data types
        //Stores whole numbers positive and negative
        int num1 = 10;
        //Stores decimal / fractional numbers
        double numDecimal = 2.5;
        //Stores a single character
        char letter = 'a';
        //Stores true or false
        boolean status = true;
        //Stores a String of text
        String str = "Hello world";
        int num2 = 14;

        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        //plus sign is used for concatenation (joining Strings together)
        // & also addition (regular maths!)
        //Java uses order of operations BIDMAS / BODMAS / PEMDAS / PODMAS
        System.out.println(str + (num1 + num2));


    }
}
