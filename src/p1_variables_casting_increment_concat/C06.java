package p1_variables_casting_increment_concat;

import java.util.Scanner;

public class C06 {
    public static void main(String[] args) {

        // Get a for digit number from the user and print the sum of the digits

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a positive 4-digit integer number");
        int enteredNumber= scan.nextInt(); // i.e. assume that it is 1469


        int unitsDigit=0;
        int sumDigits=0;

        // number: 1469, units digit=0 ve sum of the digits=0

        unitsDigit= enteredNumber%10; // Java will find 9 from here
        sumDigits= sumDigits+unitsDigit; // Java will find 0+9= 9 from here
        enteredNumber= enteredNumber/10; // Then, Java will now handle 146 here

        // number becomes: 146 and unitsDigit:9 while sumDigits becomes as 9

        unitsDigit=enteredNumber%10; // Java will find 9 from here
        sumDigits=sumDigits+unitsDigit; // Java will find 9+6= 15 from here
        enteredNumber=enteredNumber/10; // Then, Java will now handle 14 here

        // number becomes: 14 and unitsDigit:6 while sumDigits becomes as 15

        unitsDigit=enteredNumber%10; // Java will find 4 from here
        sumDigits=sumDigits+unitsDigit; // Java will find 15+4= 19 from here
        enteredNumber=enteredNumber/10; // Then, Java will now handle 1 here

        // number becomes: 1 and unitsDigit:4 while sumDigits becomes as 19

        unitsDigit=enteredNumber%10; // Java will find 1 from here (1 remains after 1/10)
        sumDigits=sumDigits+unitsDigit; // Java will find 19+1= 20 from here
        enteredNumber=enteredNumber/10; // Finally, Java will now handle 0 here (0 is quotient after 1/10'da)

        System.out.println("Sum of the digits of the entered number: " + sumDigits);

        scan.close();

    }
}
