public class Conta {
            
    // variavel de saldo, da classe conta
    double saldo = 10.0;
    double novoSaldo = 0.0;
    double retirada = 0.0;
    double credito = 0.0;
    
    // METODO CREDITAR
    public void creditar(double valorCredito) {
        credito = valorCredito;
        novoSaldo = novoSaldo + credito;

    }

    // METODO SACAR
    public void sacar(double valorSaque) {
        retirada = valorSaque;
        novoSaldo = novoSaldo - retirada;

    }

    // METODO IMPRIMIR SALDO
    public void imprimirSaldo(){
        // disponivel em toda classe
        System.out.println(saldo);
        System.out.println(novoSaldo);

    }

    // METODO PARA CALCULAR DÍVIDA
    public double calcularDividaExponencial(){
        // variavel local do metodo
        //int x = 0;
        double valorParcela = 50.0;
        double valorMontante = 0.0; //começando a variavel com valor 0.0
        
        for(int x=1; x<=5; x++) {// x variavel de escopo de fluxo
            // essa variavel sera reiniciada a cada execução do for
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado; 
        }
            return valorMontante;

    }

    // ESCOPO DE FLUXO
    // x e valorCalculado nunca estarão disponiveis foda do for

    
}

