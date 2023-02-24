public class Operadores {
    public static void main(String[] args) throws Exception {
        
        String nomeCompleto = "Linguagem " + "Java";

        System.out.println(nomeCompleto);

        //qual o resultado das expressoes abaixo?
        String concatenacao ="?";
            System.out.println(concatenacao);
        
        concatenacao = 1+1+1+"1";
            System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+1;
            System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+"1";
            System.out.println(concatenacao);
        
        concatenacao = "1"+1+1+1;
            System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
            System.out.println(concatenacao);

    }
}
