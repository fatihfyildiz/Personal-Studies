import java.util.Scanner;

public class C11 {

    public static void main(String[] args) {

        /*
        Get a number from the user and if it can be divided by 5, then print it as "Entered number is a multiple of 5"
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a positive integer number");

        int enteredNumber= scan.nextInt();

        if (enteredNumber % 5 ==0) {
            System.out.println("Entered number is a multiple of 5");

        }

        scan.close();


    }
}
