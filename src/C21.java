import java.util.Scanner;

public class C21 {
    public static void main(String[] args) {

        // Get an integer number from the user
        // if it is even number, print as "It's an even number"
        // else, increase the value of number by 5 and then print it

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter an integer number");
        int number= scan.nextInt();

        System.out.println(number%2==0 ? "It's an even number" : "Its new value : " + (number=number+5));


    }
}
