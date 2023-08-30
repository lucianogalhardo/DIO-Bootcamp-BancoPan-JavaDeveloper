package ExercicosList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


/*
Exercicio 01

        Faça um programa que receba a temperatura média dos 6
        primeiros meses do ano e armazene-as em uma lista.

        Após isto, calcule a média semestral das temperaturas e
        mostre todas as temperaturas acima desta média, e em que
        mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
        – Fevereiro e etc).

 */
public class Exercicio01List {
    public static void main(String[] args) {

        // criando o scanner para entrada de dados
        Scanner scan = new Scanner(System.in);
        // Criar lista
        List<Double> temperaturas = new ArrayList<Double>();

        // adicionando as temperaturas na lista
        int cont = 0;
        while (true) {
            if (cont == 6) break;

            System.out.println("Digite a temperatura: ");
            Double temperatura = scan.nextDouble();
            temperaturas.add(temperatura);
            cont++;


        }
        System.out.println("-------------------------");

        // exibindo todas as temperaturas
        System.out.println("Todas as temperaturas: ");
        temperaturas.forEach(t -> System.out.println(t + ""));

        // calculano e exibindo medias das temperaturas
        Iterator<Double> iterator = temperaturas.iterator();
        Double soma = 0d;
        Double media = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;

        }
        media = soma / temperaturas.size();
        System.out.printf("\nMédia das temperaturas: %.1f\n", media);

//      exibindo temperaturas acima da media
//        System.out.println("Temperaturas acima da média: " );
        System.out.println("Temperaturas acima da média semestral (" + media + "):");
        for (int i = 0; i < temperaturas.size(); i++) {
            double temperatura = temperaturas.get(i);
            if (temperatura > media) {
                String mes = mesPorExtenso(i + 1);
                System.out.println(mes + ": " + temperatura);

            }


        }

    }

    // método auxiliar para obter o nome do mês por extenso
    public static String mesPorExtenso(int mes) {
        switch (mes) {
            case 1:
                return "Janeiro";
            case 2:
                return "Fevereiro";
            case 3:
                return "Março";
            case 4:
                return "Abril";
            case 5:
                return "Maio";
            case 6:
                return "Junho";
            default:
                return "";
        }
    }
}


class Meses {
    private String mes;
    private Double temperatura;

    public Meses(String mes, Double temperatura) {
        this.mes = mes;
        this.temperatura = temperatura;
    }

    public String getMes() {
        return mes;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {
        return "Meses{" +
                "mes='" + mes + '\'' +
                ", temperatura=" + temperatura +
                '}';
    }
}