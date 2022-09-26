import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {

        // Get two double numbers from the user and divide the first number by the second number,
        // then print the integer part of the result (quotient) of the division operation

        Scanner scan= new Scanner(System.in);
        System.out.println("enter two double numbers, \npush ENTER between them");
        double number1= scan.nextDouble();
        double number2= scan.nextDouble();

        int result= (int)(number1/number2);

        System.out.println("Integer part of the division operation: " + result);

        scan.close();
    }
}
