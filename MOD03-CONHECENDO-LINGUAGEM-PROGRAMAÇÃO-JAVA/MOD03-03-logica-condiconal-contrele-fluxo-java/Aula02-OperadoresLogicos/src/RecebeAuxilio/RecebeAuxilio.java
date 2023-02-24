package RecebeAuxilio;

public class RecebeAuxilio {
    public static void main(String[] args) {

        double salarioMensal = 3500;
        double mediaSalario = 4500;

        int qtdDependentes = 3;
        int mediaDependentes = 2;

        boolean salBaixo = (salarioMensal < mediaSalario);
        boolean muitosDependentes = (qtdDependentes > mediaDependentes);
        boolean recebeAuxilio = (salBaixo && muitosDependentes);

        System.out.println("\n");
        System.out.println("O Salário é abaixo da média? " + salBaixo);
        System.out.println("\n");
        System.out.println("Nr. Dependentes acima da média? " + muitosDependentes);
        System.out.println("\n");
        System.out.println("tem direito ao auxilio? " + recebeAuxilio);

    }
}
