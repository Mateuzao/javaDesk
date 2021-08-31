package br.com.cavalcante.basic_Methods;

public class Main {
    public static void main(String[] args) {

        /**----------------  Java Methods  ------------------------  */
        System.out.println("-------------------------------------------This is a simple example of Java Methods ------------------------------------------------------------------");

        System.out.println("Welcome to the Java Methods\n");
        System.out.println("A method is a block of code which only runs when it is called.\n" +
                "\n" +
                "You can pass data, known as parameters, into a method.\n" +
                "\n" +
                "Methods are used to perform certain actions, and they are also known as functions.\n" +
                "\n" +
                "Why use methods? To reuse code: define the code once, and use it many times.\n");

        /**---------------------------------This is the call-----------------------------------------------------------------*/
        myMethods();
    }

    public static void myMethods(){

        /**---------------- Function Call off Java Methods  ------------------------  */
        System.out.println("------------------------ Function Call off Java Methods ---------------------------------------------------------------------------------------------");

        System.out.println("Example Explained : \n" +
                "--myMethod() is the name of the method\n" +
                "--static means that the method belongs to the Main class and not an object of the Main class. \n" +
                "--void means that this method does not have a return value. \n");
        System.out.println("To call a method in Java, write the method's name followed by two parentheses () and a semicolon; ");

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}
