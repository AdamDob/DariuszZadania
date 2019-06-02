import java.util.Random;
import java.util.Scanner;

public class Zad22 {

    public static void main(String[] args) {
        boolean dzialaj = true;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int ruchy = 0;

        int a = rand.nextInt(5);
        System.out.println(a);
        while (dzialaj){

            int zgaduj = sc.nextInt();
            if(zgaduj == a){
                System.out.println("Brawo odgales");
                ruchy = ruchy +1;
                System.out.println("Wykonales " + ruchy + " ruchy");
                dzialaj = false;
            }
            else if(zgaduj > a){
                System.out.println("Ups Twoja liczba jest zby wielka");
                ruchy = ruchy + 1;
            }
            else if(zgaduj < a){
                System.out.println("Ups Twoja liczba jest zbyt mala");
                ruchy = ruchy +1;
            }
        }
    }
}
