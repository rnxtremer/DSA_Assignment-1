//Write a Java program that takes as input three integers, a, b, and c, from the Java console
//and determines if they can be used in a correct arithmetic formula (in the given order), like
//“a + b = c,” “a = b − c,” or “a b = c.”∗


import java.util.Scanner;

public class HAQ1 {
    public static void main(String[] args) {
        Scanner rn = new Scanner(System.in);
        System.out.print("Enter the first integer (a): ");
        int a = rn.nextInt();
        System.out.print("Enter the second integer (b): ");
        int b = rn.nextInt();
        System.out.print("Enter the third integer (c): ");
        int c = rn.nextInt();
        if (a + b == c) {
            System.out.println(a + " + " + b + " = " + c);
        } 
        else if (a == b - c) {
            System.out.println(a + " = " + b + " - " + c);
        } 
        else if (a * b == c) {
            System.out.println(a + " * " + b + " = " + c);
        } 
        else {
            System.out.println("No correct arithmetic formula found.");
        }
    }
}
