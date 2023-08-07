package Datatypes;

public class Javaprogram {
    public static void main(String args[])
    {
        int first, second, add, subtract, multiply;
        float divide;

        System.out.print("Enter Two Numbers : ");
        first = 9;
        second = 6;

        add = first + second;
        subtract = first - second;
        multiply = first * second;
        divide = (float) first / second;

        System.out.println("Sum = " + add);
        System.out.println("Difference = " + subtract);
        System.out.println("Multiplication = " + multiply);
        System.out.println("Division = " + divide);
    }
}


