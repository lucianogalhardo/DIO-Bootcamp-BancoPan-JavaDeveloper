package ExercicioSet;

/*
Crie um conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi o climatérico;
e) Exiba todas as cores que começam com a letra “v”;
f) Remoção de todas as cores que não comecem com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
*/


import java.util.*;

public class Exercicio01OrdenacaoSet {

    public static void main(String[] args) {

        System.out.println("Crie um conjunto contendo as cores do arco-iris");
        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("violeta");
        coresArcoIris.add("anil");
        coresArcoIris.add("azul");
        coresArcoIris.add("violeta");
        coresArcoIris.add("amarelo");
        coresArcoIris.add("laranja");
        coresArcoIris.add("vermelho");
        System.out.println(coresArcoIris);


        System.out.println("Exiba todas as cores o arco-íris uma abaixo da outra;");
        for (String cor : coresArcoIris){
            System.out.println(cor);
        }

        System.out.println("A quantidade de cores que o arco-íris tem;");
        System.out.println("Total de cores do arco-iris: " + coresArcoIris.size());

        System.out.println("Exiba as cores em ordem alfabética;");
        Set<String> coresArcoIris1 = new TreeSet<>(coresArcoIris);
        System.out.println(coresArcoIris1);

        System.out.println("Exiba as cores na ordem inversa da que foi o climatérico;");
        Set<String> coresArcoIris2 = new LinkedHashSet<>(coresArcoIris);
        System.out.println(coresArcoIris2);
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris2);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);

        System.out.println("Exiba todas as cores que começam com a letra “v”;");
        for (String cor: coresArcoIris){
            if (cor.startsWith("v"))
                System.out.println(cor);
        }

        System.out.println("Remoção de todas as cores que não comecem com a letra “v”;");
        Iterator <String> iterator1 = coresArcoIris.iterator();
        while (iterator1.hasNext()){
            String inicial = iterator1.next();
            if (!inicial.startsWith("v"))
                iterator1.remove();

        }
        System.out.println(coresArcoIris);


        System.out.println("Limpe o conjunto");
        coresArcoIris.clear();


        System.out.println("Confira se o conjunto está vazio: " +  coresArcoIris.isEmpty());




    }

}
