import java.util.Scanner;

public class C14 {

    public static void main(String[] args) {

        // Get a letter from the user and if it is lowercase (small), then print it as Capital letter (uppercase),
        // if not, then print its original case

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a letter");

        char enteredChar=scan.next().charAt(0);

        if(enteredChar>='a' && enteredChar<='z'){
            System.out.println((char)(enteredChar-32)); // By casting we provide it as letter, instead of number
            // since -32 is printed as a digit/number, we cast it to a char(character)
        } else {
            System.out.println(enteredChar);
        }
        scan.close();

    }
}
