

public class MovimentacaoConta {
    
    public static void main(String[] args) throws Exception {
        
        Conta conta = new Conta();

        System.out.println("01/02  -  Saldo inicial: " + conta.saldo);
               
        conta.novoSaldo = conta.saldo;

        conta.creditar(100.0);
        System.out.println("01/02  -  Depósito: " + conta.credito);
        System.out.println("01/02  -  Saldo: " + conta.novoSaldo);
        
        System.out.print("\n");
        conta.sacar(70.0);
        System.out.println("05/02  -  Retirada: " + conta.retirada);
        System.out.println("05/02  -  Saldo: " + conta.novoSaldo);

        System.out.print("\n");
        conta.creditar(1000.0);
        System.out.println("09/02  -  Depósito: " + conta.credito);
        conta.creditar(2000.0);
        System.out.println("09/02  -  Depósito: " + conta.credito);
        System.out.println("09/02  -  Saldo: " + conta.novoSaldo);

        System.out.print("\n");
        conta.sacar(1500.0);
        System.out.println("15/02  -  Retirada: " + conta.retirada);
        conta.sacar(2000.0);
        System.out.println("15/02  -  Retirada: " + conta.retirada);
        System.out.println("15/02  -  Saldo: " + conta.novoSaldo);
        
        System.out.print("\n");
        System.out.println("17/02  -  Saldo: " + conta.novoSaldo);

        conta.calcularDividaExponencial();
        
        
    }

}
