import java.util.Scanner;

public class C01 {

    public static void main(String[] args) {

        // Get a double and int numbers from user and print their sum and product

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter an integer number : ");
        int integerNumber= scan.nextInt();

        System.out.println("Please enter a decimal number : ");
        double decimalNumber= scan.nextDouble();

        System.out.println("Product of the entered numbers:" + integerNumber*decimalNumber);
        System.out.println("Sum of the entered numbers:" + (integerNumber+decimalNumber));

        scan.close();
    }
}
