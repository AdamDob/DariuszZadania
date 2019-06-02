import java.util.Random;
import java.util.Scanner;

public class Przyklad23 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int tab [] = new int[10];


       for(int i =0; i<tab.length; i++){
           tab[i] = rand.nextInt(10);
           System.out.println ("Liczba losowa " +tab[i] +  "  " + " indekst =  " + i );

        }
    }
}
