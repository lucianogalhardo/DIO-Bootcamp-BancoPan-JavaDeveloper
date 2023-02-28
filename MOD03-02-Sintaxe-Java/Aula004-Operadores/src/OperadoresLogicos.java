public class OperadoresLogicos {
    
    public static void main(String[] args) {
        
        boolean condicao1 = true;
        boolean condicao2 = true;

        // Verificando se as condicoes são verdadeiras
        // && (E)
        if(condicao1 && condicao2){
            System.out.println("as duas condições são verdadeiras");
        }

        // Outro exemplo Verificando se as condicoes são verdadeiras
        // && (E)
        if(condicao1 && ( 4 < 7) ){
            System.out.println("as duas condições são verdadeiras");
        }

        // Verificando se as condicoes são verdadeiras
        // || (OU)
        if(condicao1 || condicao2){
            System.out.println("Uma das duas condições são verdadeiras");
        }

        System.out.println("fim");


    }
}
