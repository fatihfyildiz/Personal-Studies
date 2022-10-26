public class C27 {

    public static void main(String[] args) {

        /*
        Equals method controls whether two entered String variables are same or not...
         */

        int number=20;

        if (number==20){
            System.out.println("equality is right");
        }

        char letter='b';

        if (letter=='c'){
            System.out.println("Letter is c");
        }else {
            System.out.println("Letter is NOT c");
        }

        String str1= "Fatih";  // Fatih
        String str2= "fatih";  // fatih
        String str3= new String("Fatih");  // Fatih

        System.out.println("str3 : " + str3);

        System.out.println(str1==str2);  // false... Because, Fatih is NOT equal to fatih
        System.out.println(str1==str3);  // false... Because, == cannot be used for String, it processes different
        System.out.println(str1.equals(str3)); // true... as expected since equals has a function like == function for String variables
        System.out.println(str1.equals(str2)); // false... Because there is lowercase-uppercase sensitivity

        /*
        If we want to control whether two String texts are same,
        then we should use equals method

        For comparing the String variables, Java controls both the text and the references;
        on the other hand Java only checks the text while using equals()
         */

    }
}
