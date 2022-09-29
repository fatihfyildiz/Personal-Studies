public class C10 {

    public static void main(String[] args) {

        String s1= "Java";
        String s2= " ";
        String s3= "easy";
        String s4= "";

        int a=3;
        int b=4;

        /*
        Try to print out the below things on the screen by Concatenation...

        12 Java easy
        7 Java easy
        34Java easy
        Java12easy
        Java34easy
        Java7easy
         */

        System.out.println(a*b+s2+s1+s2+s3); // 12 Java easy
        System.out.println(a+b+s2+s1+s2+s3); // 7 Java easy
        System.out.println(s4+a+b+s1+s2+s3); // 34Java easy
        System.out.println(a+(b+s1)+s2+s3); // 34Java easy    * alternative solution
        System.out.println(a+s4+b+s1+s2+s3); // 34Java easy   ** another solution
        System.out.println(s1+a*b+s3); // Java12easy
        System.out.println(s1+a+b+s3); // Java34easy
        System.out.println(s1+(a+b)+s3); // Java7easy
    }
}
