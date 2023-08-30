import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos: ");
        int n = scanner.nextInt();

        double h = 1.0;


        for (int i = 2; i <= n; i++) {
            h += 1.0/i;
            //soma += h;
        }

        System.out.println(Math.round(h));

        //System.out.printf("O valor de H com %d termos é %.0f.\n", n, h);
        //System.out.printf("A soma dos termos é %.2f.\n", soma);

        scanner.close();


    }
}