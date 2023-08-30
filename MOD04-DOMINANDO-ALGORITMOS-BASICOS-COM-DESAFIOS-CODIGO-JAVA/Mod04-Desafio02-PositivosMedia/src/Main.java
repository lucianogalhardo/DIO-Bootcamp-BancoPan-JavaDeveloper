import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double x1 = 0;
        double media = 0;
        int qtdPositivo = 0;


        System.out.println("Informe 6 números: ");

        for (int i = 0; i < 6; i++) {

            x1 = leitor.nextDouble();

            if (x1 > 0) {
                qtdPositivo = qtdPositivo + 1;
                media = media + x1;

            }

        }

        media = media / qtdPositivo;
        System.out.println(qtdPositivo);
        System.out.println(media);
    }

}