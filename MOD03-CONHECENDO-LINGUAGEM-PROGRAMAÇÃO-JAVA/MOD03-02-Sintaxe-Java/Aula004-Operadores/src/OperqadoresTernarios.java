public class OperqadoresTernarios {
    public static void main(String[] args) {

        int a, b;
        
        a = 5;
        b = 6;
        
        
        /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        String resultado = "";

        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado);
        */
        
        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        // TIPO STRING, sendo a igual b
        
        String resultado = a==b ? "verdadeiro" : "falso";
        
        System.out.println(resultado);

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        // TIPO INTEIRO, sendo a diferente de b

        int resultado1 = a!=b ? 1 : 0;
        
        System.out.println(resultado1);




    }
}

