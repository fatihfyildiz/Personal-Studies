import java.util.Scanner;

public class C23 {
    public static void main(String[] args) {

        /*
        Gete a number from the user
        If it is positive, print the suitable choice that it is even or odd number
        If it is negative, print the suitable choice that it is 3-digit number or not
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter an integer number");
        int number= scan.nextInt();

        String result = number > 0 ?                                                                    // condition ?
                (number%2==0 ? "It is an even number" : "It is an odd number") :                        // true :
                (number<=-100 && number>= -999 ? "It is 3-digit number" : "It is not 3-digit number");  // false

        /*
        Ternary ==>    condition ? true : false
         */

        System.out.println(result);

        scan.close();

    }
}
