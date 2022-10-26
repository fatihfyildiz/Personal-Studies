package p1_variables_casting_increment_concat;

public class C08 {

    public static void main(String[] args) {
        int a=10;
        System.out.println("Value of a is : " + ++a);  // (pre-increment) first a is increased to 11 and then printed as 11

        int b=a++; // (post-increment) firstly value of a as 11 is assigned to b (b:11), then a is increased to 12 (a:12)
        System.out.println("Value of b is : " + b); // b:11

        System.out.println("Now, value of a is : " + a); // a:12

        int c=b++ + a; // at first value of b as 11 is assigned to c (c:11) and then it is added with a (a:12)
        // therefore c becomes 23 (11 + 12 = 23)
        // finally the value of b is increased by 1, and it becomes 12 (b:12)

        System.out.println("Now, value of b is : " + b); // b:12

        System.out.println("Value of c is : " + c);  // c:23

        System.out.println("The last total is: " + (a+b+c)); // a:12 + b:12 + c: 23 = 47

    }

}
