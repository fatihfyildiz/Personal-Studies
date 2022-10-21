import java.util.Scanner;

public class C25 {

    public static void main(String[] args) {

        // Get a number from the user and print the number in letters.

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a number");
        int number= scan.nextInt();

        switch (number){
            case 0 :
                System.out.println("Zere");
                break;
            case 1 :
                System.out.println("One");
                break;
            case 2 :
                System.out.println("Two");
                break;
            case 3 :
                System.out.println("Three");
                break;
            case 4 :
                System.out.println("Four");
                break;
            case 5 :
                System.out.println("Five");
                break;
            case 6 :
                System.out.println("Six");
                break;
            case 7 :
                System.out.println("Seven");
                break;
            case 8 :
                System.out.println("Eight");
                break;
            case 9 :
                System.out.println("Night");
                break;
            default:
                System.out.println("You must enter a number");
        }

        scan.close();


    }
}
