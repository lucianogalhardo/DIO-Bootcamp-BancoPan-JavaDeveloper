public class OperadoresRelacionais {
    public static void main(String[] args) {
    
        int numero1 = 1;
        int numero2 = 2;

        if(numero1 < numero2){
                System.out.println("a nossa condição é verdadeira");

        }

        boolean sinNao = numero1 == numero2;
            System.out.println("Numero 1 é igual ao numero 2? " + sinNao);

        sinNao = numero1 != numero2;
            System.out.println("Numero 1 é diferente ao numero 2? " + sinNao);

        sinNao = numero1 > numero2;
            System.out.println("Numero 1 é maior ao numero 2? " + sinNao);

        // EXEMPLO COM STRINGS

        String nome1 = "Luciano";
        String nome2 = "Galhardo";

        System.out.println(nome1 + " " + nome2);
        System.out.println(nome1 == nome2);


    }
}
