package ExemploDebugging;

import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Luciano", "Emanuel", "João", "Mônica"};

        int media = calculadoraDeMedia(alunos, scan);

        System.out.printf("Média da turma %d", media);
    }

    public static int calculadoraDeMedia(String[] alunos, Scanner scanner){
        int soma = 0;
        for (String aluno : alunos){
            System.out.printf("Nota do Aluno %s: ", aluno);
            int nota = scanner.nextInt();
            soma += nota;
        }
        return soma / alunos.length;
    }
}
