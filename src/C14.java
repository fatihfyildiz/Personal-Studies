import java.util.Scanner;

public class C14 {

    public static void main(String[] args) {

        // Get a letter from the user and if it is
        // Soru5- Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");

        char girilenKarakter=scan.next().charAt(0);

        if(girilenKarakter>='a' && girilenKarakter<='z'){
            System.out.println((char)(girilenKarakter-32)); //Casting yaparak rakam yerine harf gorunmesini sagladik
            // cunku -32 deyince rakam cikiyordu
        } else {
            System.out.println(girilenKarakter);
        }
        scan.close();

    }
}
