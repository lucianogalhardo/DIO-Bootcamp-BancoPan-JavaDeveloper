public class AboutMe {
    
    public static void main(String[] args) {
        
       
       
        // os Argumentos começam com índice 0
        String nome = args [0];
        String sobreNome = args [0];
        int idade = Integer.valueOf(args[2]); // vamos falar sobre Wrappers
        double altura =Double.valueOf(args[3]);

        System.out.println("Olá, me chamo "+ nome + " " + sobreNome);
        System.out.println("Tenho " + idade + "anos");
        System.out.println("Minha altura é " + altura + "cm");
        
    }
}
