package p2_ifElse_NestedIf_Ternary_Switch;

import java.util.Scanner;

public class C18 {

    public static void main(String[] args) {

        /*
        Get age and gender from the user;
        Woman can be retired if over 60 age while
        man cen be retired after 65 age.
        Therefore, print in console that "You can retire" or "You cannot retire, you have to work for ... years"
        due to the user's age and gender.
         */

        // Note: If there are more than one variable, we must establish the codes based on the selected varriable.
        // For example, in this solution we will establish on the age

        Scanner scan = new Scanner(System.in);
        System.out.println("Please indicate your gender by entering W for woman, M for man");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        // by UpperCasing we ignore the entered lowercase/small letters and by CharAt we just consider the letter at the index 0
        System.out.println("Please enter your age");
        double age = scan.nextDouble();

        if (age < 0) {
            System.out.println("Your age cannot be lower than 0");
        } else if (age < 60) { // Nobody will be retired
            if (cinsiyet == 'W') {
                System.out.println("You cannot retire, you have to work for " + (60 - age) + " years");
            } else if (cinsiyet == 'M') {
                System.out.println("You cannot retire, you have to work for " + (65 - age) + " years");
            } else {
                System.out.println("Please control the entered information. You mistype something");
            }

        } else if (age < 65) { // Woman can retire, while man cannot retire
            if (cinsiyet == 'W') {
                System.out.println("You can retire");
            } else if (cinsiyet == 'M') {
                System.out.println("You cannot retire, you have to work for " + (65 - age) + " years");
            } else {
                System.out.println("Please control the entered information. You mistype something");
            }

        } else {
            System.out.println("You can retire");
        }

        scan.close();

    }
}
