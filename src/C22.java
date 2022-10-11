import java.util.Scanner;

public class C22 {

    public static void main(String[] args) {

        // Get a number from the user and print its absolute value

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter an integer number");
        int number= scan.nextInt();

        // for finding the absolute value;
        // if the entered number is positive, just taking it,
        // else if it is negative, then multiple it by -1

        number= number>=0 ? number : -1*number;

        System.out.println("The absolute value of the entered number is : " + number);

        scan.close();
    }
}
