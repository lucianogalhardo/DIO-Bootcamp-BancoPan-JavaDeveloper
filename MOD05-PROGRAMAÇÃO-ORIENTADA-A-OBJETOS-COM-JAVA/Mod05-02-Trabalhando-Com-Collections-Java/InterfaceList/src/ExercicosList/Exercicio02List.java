package ExercicosList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



//Exercico 02
//
//        Utilizando listas, faça um programa que faça 5 perguntas para uma
//        pessoa sobre um crime. As perguntas são:

//        "Telefonou para a vítima?"
//        "Esteve no local do crime?"
//        "Mora perto da vítima?"
//        "Devia para a vítima?"
//        "Já trabalhou com a vítima?"

//        Se a pessoa responder positivamente a 2 questões ela deve ser
//        classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
//        "Assassina". Caso contrário, ela será classificado como "Inocente".
public class Exercicio02List {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> respostas = new ArrayList<String>();

        System.out.println(" Responda:  (S) para SIM e (N) para NÃO");

        int cont = 0;
        for (int i = 0; i < 5; i++) {
            String pergunta = perguntas(i + 1);
            System.out.println(pergunta);
            String resp = scan.next();
            respostas.add(resp);

          if (resp.contains("s")){
//            if (resp == "s" || resp == "S") {
                cont = cont + 1;
//                System.out.println(resp);
            }


        }
        System.out.println("SENTENÇA: ");
        System.out.println(sentencas(cont));

        System.out.println("<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
    }

    public static String perguntas(int pergunta) {

        switch (pergunta) {
            case 1:
                return "1- Telefonou para a vítima?";
            case 2:
                return "2- Esteve no local do crime?";
            case 3:
//                return "3- Mora perto da vítima?";
            case 4:
                return "4- Devia para a vítima?";
            case 5:
                return "5- Já trabalhou com a vítima?";
            default:
                return "";

        }
    }

    public static String sentencas(int sentenca) {

        switch (sentenca){
        case 2:
            return ">> TESTEMUNHA SUSPEITA <<";
        case 3:
            return ">> TESTEMUNHA CÚMPLICE <<";
        case 4:
            return ">> TESTEMUNHA CÚMPLICE <<";
        case 5:
            return ">> ASSASSINO <<";
        default:
            return ">> TESTEMUNHA INOCENTE <<";

        }
    }
}

