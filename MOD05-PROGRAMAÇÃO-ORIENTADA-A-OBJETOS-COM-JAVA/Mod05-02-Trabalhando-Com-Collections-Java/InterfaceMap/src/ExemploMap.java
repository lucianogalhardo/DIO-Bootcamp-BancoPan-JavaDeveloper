import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    public static void main(String[] args) {

/*
Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
modelo = gol - consumo = 14,4km/l
modelo = uno - consumo = 15,6 km/l
modelo = mobi - consumo = 16,1 km/l
modelo = hb20 - consumo = 14,5 km/l
modelo = kwid - consumo = 15,6 km/l
*/

// Mapa carrosPopulares2020 = new HashMap(); // antes do java 5
// Map<String, Double> carrosPopulares = new HashMap<>(); //Genéricos(jdk 5) - Diamont Operator(jdk 7)
// HashMap<String, Double> carrosPopulares = new HashMap<>();
// Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6)

        System.out.println();
        System.out.println( " ------- (1) Crie um dicionário que relacione os modelos de carros ------- ");
        System.out.println(" ------- (2) Informe seus respectivos consumos ------- " );
        System.out.println();

        Map< String , Double > carrosPopulares = new  HashMap<>() {{

            put ( "gol" , 14.4 );
            put ( "uno" , 15.6 );
            put ( "mobi" , 16.1 );
            put ( "hb20" , 14.5 );
            put ( "kwid" , 15.6 );
        }};
        System.out.println( carrosPopulares.toString ());

//        Sistema . fora . println ( "Substitui o consumo do gol por 15,2 km/l: " );
//        carrosPopulares . put ( "gol" , 15.2 );
//        Sistema . fora . println ( carrosPopulares );
//
//        Sistema . fora . println ( "Confira se o modelo tucson está no dicionário: " + carrosPopulares . containsKey ( "tucson" ));
//
//        Sistema . fora . println ( "Exiba o consumo do uno: " + carrosPopulares . get ( "uno" ));
//
//// System.out.println("Exiba o terceiro modelo adicionado: ");
//
//        Sistema . fora . println ( "Exiba os modelos: " );
//        Defina < String > modelos = carrosPopulares . conjunto de chaves ();
//        Sistema . fora . println ( modelos );
//
//        Sistema . fora . println ( "Exiba os consumos dos carros: " );
//        Coleção < Double > consumos = carros Populares . valores ();
//        Sistema . fora . println ( consumos );
//
//        Sistema . fora . println ( "Exiba o modelo mais econômico e seu consumo: " );
//
//        Duplo  consumoMaisEficiente = Cobranças . max ( carrosPopulares.values () ) ;
//        Definir < Mapa . Entrada < String , Double >> entradas = carrosPopulares . entradaConjunto ();
//        String  modeloMaisEficiente = "" ;
//
//        for ( Mapa . Entrada < String , Duplo > entrada : entradas ) {
//            if ( entrada . getValue (). equals ( consumoMaisEficiente )) {
//                modeloMaisEficiente = entrada . getKey ();
//                Sistema . fora . println ( "Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente );
//            }
//        }
//
//        Sistema . fora . println ( "Exiba o modelo menos econômico e seu consumo: " );
//
//        Duplo  consumoMenosEficiente = Cobranças . min ( carrosPopulares.values ( )) ;
//        String  modeloMenosEficiente = "" ;
//        for ( Map . Entry < String , Double > entry : carrosPopulares . entrySet ()) {
//            if ( entrada . getValue (). equals ( consumoMenosEficiente )) {
//                modeloMenosEficiente = entrada . getKey ();
//                Sistema . fora . println ( "Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente );
//            }
//        }
//
//        Iterator < Double > iterator = carrosPopulares . valores (). iterador ();
//        Soma dupla = 0d ;
//        while ( iterator . hasNext ()){
//            soma += iterador . próximo ();
//        }
//        Sistema . fora . println ( "Exiba a soma dos consumos: " + soma );
//
//        Sistema . fora . println ( "Exiba a média dos consumos deste dicionário de carros: " + ( soma / carros populares . size ()));
//
//        Sistema . fora . println ( carrosPopulares );
//        Sistema . fora . println ( "Remova os modelos com o consumo igual a 15,6 km/l: " );
//        Iterator < Double > iterator1 = carrosPopulares . valores (). iterador ();
//        while ( iterator1 . hasNext ()){
//            if ( iterator1 . next (). equals ( 15.6 )) iterator1 . remover ();
//        }
//        Sistema . fora . println ( carrosPopulares );
//
//        Sistema . fora . println ( "Exiba todos os carros na ordem em que foram informados: " );
//        Map < String , Double > carrosPopulares1 = new  LinkedHashMap <>() {{
//            put ( "gol" , 14.4 );
//            put ( "uno" , 15.6 );
//            colocar ( "mobi" , 16.1 );
//            colocar ( "hb20" , 14.5 );
//            colocar ( "kwid" , 15.6 );
//        }};
//        Sistema . fora . println ( carrosPopulares1.toString ( )) ;
//
//        Sistema . fora . println ( "Exiba o dicionário ordenado pelo modelo: " );
//        Map < String , Double > carrosPopulares2 = new  TreeMap <>( carrosPopulares1 );
//        Sistema . fora . println ( carrosPopulares2.toString ( ) ) ;
//
//        Sistema . fora . println ( "Apague o dicionario de carros: " );
//        carrosPopulares . claro ();
//
//        Sistema . fora . println ( "Confira se o dicionário está vazio: " + carrosPopulares . isEmpty ());
    }
}

