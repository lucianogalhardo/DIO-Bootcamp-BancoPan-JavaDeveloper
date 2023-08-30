package OpLog;

public class OperadoresLogicos {
    public static void main(String[] args) {

        boolean b1 = true, b2 = false;
        boolean b3 = true, b4 = false;

        int i1 = 10;
        int i2 = 20;
        int valorI = i1+i2;

        float f1 = 4.5F;
        float f2 = 3.5F;
        float valorF = f2-f1;


        System.out.println("b1 e b2 são verdadeiros? " + (b1 && b2));
        System.out.println("b1 e b3 são verdadeiros? " + (b1 && b3));

        System.out.println("b2 ou b3 é falsos? " + (b2 || b3));
        System.out.println("b2 ou b4 é falsos? " + (b2 || b4));

        System.out.println("b1 xor b3 são opostos? " + (b1 ^ b3));
        System.out.println("b4 xor b1 são opostos? " + (b4 ^ b1));

        System.out.println("Qual inversão de !b1 ? " + ( !b1));
        System.out.println("Qual inversão de !b2 ? " + ( !b2));

        System.out.println("são verdadeiros? " + ((i1>i2) || (f2<f1)));
        System.out.println("são verdadeiros? " + ((valorI < valorF) && true));

        System.out.println("\n");
        System.out.println("Exercícios realizados com sucesso !!!");



    }
}