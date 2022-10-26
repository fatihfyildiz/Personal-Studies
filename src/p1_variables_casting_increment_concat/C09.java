package p1_variables_casting_increment_concat;

public class C09 {

    public static void main(String[] args) {

        int a=10;

        a++; // increasing a by 1 and a becomes 11

        System.out.println("Value of a is : " + a); // a:11

        ++a; // increasing a by 1, but firstly a is increased by 1 and then it is printed below
        // a'yı 1 artırma komutu ama önce artırıp, sonra aşağıdaki satırda yazdırıyoruz

        System.out.println("Now value of a is : " + a); // a:12

        // insert a new variable and assign value of a to this new variable
        // then increase the value of a by 1

        int b=a; // b:12
        a++; // a:13

        System.out.println("Currently value of a is : " + a + ", while value of b is : " + b); // a:13, b:12

        // insert a new variable and assign value of a to this new variable
        // then increase the value of a by 1
        // those were done in two lines as above, but they will be done in a single line below

        int c=a++; // c:13, a:14

        System.out.println("Last value of a is : " + a + ", and value of c is : " + b); // a:14, c:13




    }
}
