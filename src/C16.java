import java.util.Scanner;

public class C16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year data for leap-year check");
        int enteredYear= scan.nextInt();

        if (enteredYear%4 !=0) { // is year can be divided into 4 ===> No
            System.out.println("Entered year is NOT a leap-year");

        }else if (enteredYear%100 !=0) { // is year can be divided into 100 ===> No
            System.out.println("Entered year is the leap-year");

        }else if (enteredYear%400 !=0) { // is year can be divided into 400 ===> No
            System.out.println("Entered year is NOT a leap-year");
            
        }else{
            System.out.println("Entered year is the leap-year");
        }

        scan.close();

    }
}
