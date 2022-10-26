package p1_variables_casting_increment_concat;

import java.util.Scanner;

public class C04 {

    public static void main(String[] args) {

        // Get a number from the user and no matter what the user enters,
        // convert that number to a number between -128 and 127 and then print it.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        double enteredNumber= scan.nextDouble();

        byte convertedNumber= (byte)enteredNumber; // in order to convert between -128 and 127, casting to byte is done

        System.out.println("The equivalent of the entered number in the system is : " + convertedNumber);

        scan.close();
    }
}
