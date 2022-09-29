public class C07 {

    public static void main(String[] args) {

        int a = 10;
        System.out.println(a++);  // first a is printed and then it is increased to 11
        System.out.println(a); // just print a as 11

        a = 10;
        System.out.println(++a); // in this case, a is increased to 11, then it is printed as 11
        System.out.println(a); // just print a as 11

        a = 10;
        int b = a++; // since there is post-increment here, first value of a (10) is assigned to b
        // then value of a is increased to 11

        System.out.println("a: " + a + ", b : " + b); // they are printed to the screen as a:11 and b:10

        a = 10;
        b = ++a; // due to the existence of pre-increment here, first a is increased to 11
        // then value of a (11) is assigned to b

        System.out.println("a: " + a + ", b : " + b); // they are printed to the screen as a:11 and b:11

    }
}
