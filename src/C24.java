import java.util.Scanner;

public class C24 {

    public static void main(String[] args) {

        // Get the name of a day from the user and print as "weekday" else "weekend"

        Scanner scan= new Scanner(System.in);

        System.out.println("Please enter the name of a day");
        String nameDay= scan.next();
        String nameDayForControl= nameDay.toLowerCase();

        /*
        Since the String variables are case-sensitive, namely uppercase-lowercase sensitive, if any letter is different
        then it means it"s another String variables. Therefore, we use the toLowerCase in this solution and
        thus all week and weekend days will be in small letters

        In addition, we can use and change the entered day name for working with codes, but then the original/entered
        day name would be lost. Therefore, we use another/second variable for the name of day (ForControl). And, we
        can use the original/entered variable at the end while printing...
         */

        switch (nameDayForControl){
            case "monday" :
            case "tuesday" :
            case "wednesday" :
            case "thursday" :
            case "friday" :
                System.out.println("The entered day name " + nameDay + " is weekday");
                break;
            case "saturday" :
            case "sunday" :
                System.out.println("The entered day name " + nameDay + " is weekend");
                break;
            default:
                System.out.println("Mistyped day name, control and re-entered");

        }
        scan.close();

    }
}
