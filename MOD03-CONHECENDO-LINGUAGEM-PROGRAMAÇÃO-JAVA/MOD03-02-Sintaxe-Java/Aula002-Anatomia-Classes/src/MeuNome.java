public class MeuNome {
    
    public static void main(String[] args) {

        
       
        System.out.println ("Olá turma, sejam bem-vindos");
        System.out.println ("repetindo na sgunda linha");
    
        String primeiroNome = "Luciano";
        String segundoNome = "Galhardo";
    
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    
        System.out.println(nomeCompleto);
        
    }
    
    // CRIAR UM MÉTODO CHAMADO DE nomeCompleto, com 02 parâmetros do tipo String, sendo "primeiroNome" e "segundoNome"
    // no corpo do método, utilizar a função RETURN inserindo texto e concatenando com os valores dos parâmetros.
    
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Meu nome completo é: " + primeiroNome + (" ") + segundoNome;
    
    }
}
