import java.util.Scanner;

public class C03 {

    public static void main(String[] args) {

        // Get a letter from the user and print the next three letters in the alphabet

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a letter");
        char enteredLetter=scan.next().charAt(0);

        System.out.println("Entered letter is : " + enteredLetter);

        System.out.println("The next letter in the alphabet is : " + (char)(enteredLetter+1));
        System.out.println("The second next letter in the alphabet is : " + (char)(enteredLetter+2));
        System.out.println("The third next letter in the alphabet is : " + (char)(enteredLetter+3));

        scan.close();
    }

}
