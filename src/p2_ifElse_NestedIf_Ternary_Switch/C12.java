package p2_ifElse_NestedIf_Ternary_Switch;

import java.util.Scanner;

public class C12 {

    public static void main(String[] args) {

        // Get the three sides of a triangle from the user and
        // if they are equals each other, then print as "It is a equilateral triangle"

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter the three sides of the triangle as the positive integer numbers");

        int side1= scan.nextInt();
        int side2= scan.nextInt();
        int side3= scan.nextInt();

        if (side1==side2 && side2==side3) {
            System.out.println("It is a equilateral triangle");
        }

        scan.close();
    }
}
