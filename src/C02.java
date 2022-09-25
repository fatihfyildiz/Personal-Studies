import java.util.Scanner;

public class C02 {

    public static void main(String[] args) {

        /*
        Print the name, surname and age of the user as follows;
        Name: John
        Surname: Doe
        Age: 38
        Your registration has been successfully recorded
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name :");
        String name=scan.nextLine();

        System.out.println("Please enter your surname :");
        String surname= scan.nextLine();

        System.out.println("Please enter your age :");
        int age= scan.nextInt();

        System.out.println("Name: " + name + "\nSurname: " + surname + "\nAge: " + age
                + "\nResult: Your registration has been successfully recorded");

        /*
        Either scan.next() or scan.nextLine() can be used with the String Variables.
        But, scan.next() has just scanned until the first space, whether scan.nextLine() scans the whole line

        Therefore, if the user is expected to enter more than one string variables,
        it will be better to use scan.nextLine()
         */

        scan.close();
    }
}
