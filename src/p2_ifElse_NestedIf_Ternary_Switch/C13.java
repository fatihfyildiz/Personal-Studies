package p2_ifElse_NestedIf_Ternary_Switch;

import java.util.Scanner;

public class C13 {

    public static void main(String[] args) {

        // Get the exam score from the user and if it is equal or over 60 print as "Passed",
        // else if it is below 60 then print as "Failed"

        /*
        Note: If there are only two possibilities with the written codes, then we generally use if-else statements.
        As it can be clearly understood, only one of the alternatives can work, it is impossible to occurrence of both
        In addition, there is no possibility that none of them will work, at least one must work...
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your exam score");

        double score= scan.nextDouble();

        if (score>=60) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");

        }
        scan.close();
    }
}
