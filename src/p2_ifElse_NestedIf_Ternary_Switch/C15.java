package p2_ifElse_NestedIf_Ternary_Switch;

import java.util.Scanner;

public class C15 {

    public static void main(String[] args) {

        /*
         Get distance in kilometers from user and ask the unit that user wants to convert.
         If the desired unit is meters or centimeters, convert the entered distance into the anted units and print,
         otherwise print "the unit that you want is not registered to the system"
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the distance that you want convert to kilometers");
        int distanceKm= scan.nextInt();
        System.out.println("Select the unit you want to convert + " +
                "\nM: Meter \nC: Centimeter");
        char select=scan.next().charAt(0);

        if (select=='M' || select=='m') {
            System.out.println("Equivalent of the entered distance in meters : " + distanceKm * 1000);
        } else if (select=='C' || select=='c'){
            System.out.println("Equivalent of the entered distance in centimeters : " + distanceKm * 100000 );
        } else {
            System.out.println("The unit that you want is not registered to the system");
        }
        scan.close();


    }
}
