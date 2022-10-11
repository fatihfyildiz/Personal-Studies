import java.util.Scanner;

public class C19 {

    public static void main(String[] args) {

        /*
        Get the number of bought product and its list price from the user,
        ask the user if s/he has Customer Card or not,
        if there exist Customer Card and more than 10 products are bought then make 20% discount, else 15% discount,
        if s/he has not Customer Card and more than 10 products are bought then make 15% discount, else 10% doíscount,
        Print the total discount and the amount to be paid
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter the number of the product \nAnd its price");

        int number = scan.nextInt();
        double listPrice = scan.nextDouble();

        System.out.println("If there is Customer Card enter Y, else enter N");
        char card = scan.next().toUpperCase().charAt(0);

        // let's establish the base due to the existence of Customer Card

        double totalSalesAmount = number * listPrice;
        double madeDiscount = 0;
        double amountToBePaid = 0;

        if (card=='Y') { // Customer Card Block
            if (number > 10) { // 20% discount
                System.out.println("Sales amount due to the list price: " + totalSalesAmount +
                        "\nDiscount amount that we make for you: " + totalSalesAmount * 20 / 100 +
                        "\nThe amount to be paid by you: " + (totalSalesAmount - totalSalesAmount * 20 / 100));

            } else { // 15 discount
                System.out.println("Sales amount due to the list price: " + totalSalesAmount +
                        "\nDiscount amount that we make for you: " + totalSalesAmount * 15 / 100 +
                        "\nThe amount to be paid by you: " + (totalSalesAmount - totalSalesAmount * 15 / 100));
            }


        } else if (card=='N') { // Block for the lack of Customer Card
            if (number > 10) { // 15% discount
                System.out.println("Sales amount due to the list price: " + totalSalesAmount +
                        "\nDiscount amount that we make for you: " + totalSalesAmount * 15 / 100 +
                        "\nThe amount to be paid by you: " + (totalSalesAmount - totalSalesAmount * 15 / 100));

            } else { // % 10 indirim
                System.out.println("Sales amount due to the list price: " + totalSalesAmount +
                        "\nDiscount amount that we make for you: " + totalSalesAmount * 10 / 100 +
                        "\nThe amount to be paid by you: " + (totalSalesAmount - totalSalesAmount * 10 / 100));
            }


        } else {
            System.out.println("Invalid card information");
        }
        scan.close();

    }
}
