package ControleFluxo;

public class NomeMes {

    public static void main(String[] args) {

        // PRIMEIA PARTE DO EXERCICIO, IDENTIFICAR O NOME DO MÊS PELO CÓDIGO
        int mes = 11;
        String nomeMes = "";

        if (mes == 1) {
            nomeMes = "Janeiro";
        }else if (mes == 2){
            nomeMes = "Fevereiro";
        }else if (mes == 3) {
            nomeMes = "Março";
        }else if (mes == 4) {
            nomeMes = "Abril";
        }else if (mes == 5) {
            nomeMes = "Maio";
        }else if (mes == 6) {
            nomeMes = "Junho";
        }else if (mes == 7) {
            nomeMes = "Julho";
        }else if (mes == 8) {
            nomeMes = "Agosto";
        }else if (mes == 9) {
            nomeMes = "Setembro";
        }else if (mes == 10) {
            nomeMes = "Outubro";
        }else if (mes == 11) {
            nomeMes = "Novembro";
        }else if (mes == 12) {
            nomeMes = "Dezembro";
        }
        System.out.print("\n");
        System.out.println("Estamos no mês de: " + nomeMes);

        // SEGUNDA PARTE DO EXERCICIO, IDENTIFICAR SE É O MÊS DE FÉRIAS

        if (nomeMes == "Julho" || nomeMes == "Dezembro" || nomeMes == "Janeiro"){
            System.out.print("\n");
            System.out.println("ATENÇÃO!!! FÉRIAS !!!");
        } else {
            System.out.print("\n");
            System.out.println("nada de férias!!!");
        }
    }
}
