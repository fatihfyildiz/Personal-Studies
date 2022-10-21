import java.util.Locale;

public class C26 {

    public static void main(String[] args) {


        // We can easily convert a String variable into Uppercase or Lowercase

        String str= "Java is great";

        System.out.println(str.toUpperCase()); // JAVA IS GREAT
        // But, toUpperCase() and toLowerCase() work temporarily

        System.out.println(str); // Java is great

        // If we want to make a permanent change, we must assign/define

        str=str.toUpperCase();

        System.out.println(str); // JAVA IS GREAT

        System.out.println(str.toLowerCase()); // java is great

        // if we want to make Uppercase or Lowercase it due to a language;

        System.out.println(str.toUpperCase(Locale.GERMAN)); // JAVA IS GREAT
        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr"))); // java ıs great

    }

}
