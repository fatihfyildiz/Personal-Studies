import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C44 {

    public static void main(String[] args) {

        /*
        Question: Get variables from user and make two String Lists with them. To stop entering, the user must enter 0.
                  After creating two lists, prepare an output as follows:

                  First list is : .........
                  Second list is : ........
                  The common elements of the both lists are :
         */

    List<String> strList1= new LinkedList<>();
    strList1= makeList1();

    List<String> strList2= new LinkedList<>();
    strList2= makeList2();

        System.out.println("First list is : " + strList1);
        System.out.println("Second list is : " + strList2);

    List<String> commonElements= new LinkedList<>();

        for (String each1: strList1
             ) {
            for (String each2: strList2
                 ) {
                if (each1.equals(each2))
                    commonElements.add(each1);
            }
        }

        System.out.println("The common elements of the both lists are :" + commonElements);

    }

    public static List<String> makeList2() {
        List<String> madeList2 = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        String userEntered2 = "";

        while (!userEntered2.equals("0")) {
            System.out.println("Please enter String variables for the second list" +
                    "\nFor finishing enteer 0");

            userEntered2 = scan.nextLine();

            if (!userEntered2.equals("0")) {
                madeList2.add(userEntered2);
            }

        }
        return madeList2;

    }

    public static List<String> makeList1() {
        List<String> madeList1= new ArrayList<>();
        Scanner scan= new Scanner(System.in);

        String userEntered= "";

        while (!userEntered.equals("0")){
            System.out.println("Please enter String variables for the first List" +
                                "\nFor finishing enter 0");

            userEntered= scan.nextLine();

            if(!userEntered.equals("0")){
                madeList1.add(userEntered);
            }
        }
        return madeList1;
    }


}
