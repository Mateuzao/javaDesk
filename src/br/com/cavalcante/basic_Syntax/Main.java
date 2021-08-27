package br.com.cavalcante.basic_Syntax;

public class Main {

    public static void main(String[] args) {

        /**----------------  Java Syntax   ------------------------  */
        System.out.println("------------------------ Java Syntax -------------------------------------------------------------------------------------------------------------");
        System.out.println("Hello World");
        System.out.println("This is a simple example of Java Syntax");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");

        /**----------------  Java Variables  ------------------------  */
        System.out.println("------------------------ Java Variables ----------------------------------------------------------------------------------------------------------");
        System.out.println("This is a simple Variables");
        System.out.println("Variables are containers for storing data values");

        String name = "Mateus";
        String lastname = "Cavalcante";
        int myNum;
        myNum = 7;
        int myNum2 = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Random variables";
        int x = 2;
        int y = 2;
        int sum = x + y;



        System.out.println("Example:");
        System.out.println("Name : " +name+" "+lastname);
        System.out.println("number : "+ myNum);
        System.out.println(myNum2 +" "+myFloatNum +" "+myLetter +" "+ myBool+" "+myText);
        //System.out.println("Sum x + y = " + (x + y));
        System.out.println("Sum x+y = "+ sum);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");

        /**----------------  Java Data Types   ------------------------  */
        System.out.println("------------------------ Java Data Types ---------------------------------------------------------------------------------------------------------");
        System.out.println("Data types are divided into two groups:");
        System.out.println("Primitive data types - includes byte, short, int, long, float, double, boolean and char");
        System.out.println("Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later chapter)");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}
