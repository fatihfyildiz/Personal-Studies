import java.util.Scanner;

public class C20 {

    public static void main(String[] args) {

        // Get a number from the user,
        // if the number can be divided by 5, print "Entered number is a multiple of 5"
        // else, print as "Entered number is NOT a multiple of 5"

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter an integer number");
        int number= scan.nextInt();

        System.out.println(number % 5 == 0 ? "Entered number is a multiple of 5" : "Entered number is NOT a multiple of 5");
        // This is an example for Ternary

        scan.close();

    }
}
