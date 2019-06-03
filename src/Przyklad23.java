import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Przyklad23 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        int tab[] = new int[10];

        for(int i=0; i<tab.length;i++){
            tab[i] = rand.nextInt(10);
            System.out.print(tab[i] + " ");
        }
        boolean tak = true;
        while(tak) {
            System.out.println("\nPodaj liczbe a ja sprawdze czy znajduje sie w naszej tablicy");
            int a = in.nextInt();

            Przyklad23 przy = new Przyklad23();
            if (przy.sprawdz(tab, a)) {
                System.out.println(String.format("Prosze prosze odnalaznesc %d liczbe ", a));
                tak = false;
            } else {
                System.out.println("Nie udalo Ci sie znalezc liczby sorry ");
            }

        }

    }

    public boolean sprawdz(int[] tab, int a){
        boolean wynik = false;

        for(int b : tab){
            if(b == a){
                wynik = true;
            }
        }
        return wynik;
    }
}













/*
        int tab[] = new int[10];

        for(int i=0; i<tab.length;i++){
            tab[i] = rand.nextInt(100);
            System.out.print(tab[i] + " ");
        }

        System.out.println("Podaj liczbe ktorej szukasz");
        int value = in.nextInt();
        Przyklad23 przy = new Przyklad23();

        if(przy.contains(tab,value)){
            System.out.println(String.format("Liczba %d znaleziona! ", value));
        }
        else{
            System.out.println("Przykro nam liczba nie zbnaleziona ");
        }

 */
/*public boolean contains(int[] tab, int v){
        boolean result = false;
        for(int i : tab){
            if(i == v){
                result = true;
                break;
            }
        }
        return result;
    }

 */