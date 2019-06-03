import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Przyklad23 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);

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
    }

    public boolean contains(int[] tab, int v){
        boolean result = false;
        for(int i : tab){
            if(i == v){
                result = true;
                break;
            }
        }
        return result;
    }

}
