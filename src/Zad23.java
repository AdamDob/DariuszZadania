import java.util.Scanner;

public class Zad23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 10;

        for(int i=0; i<a;i++){
            for(int j=0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
