package ExercicioSet;

/*
Crie uma classe LinguagemFavorita que possuía os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/

import java.lang.reflect.Array;
import java.util.*;

public class Exercicio02OrdenacaoSet {

    public static void main(String[] args) {

        System.out.println();
        System.out.println(" ----- (1) Criar uma classe LinguagemFavorita -------");
        System.out.println(" ----- (2) inserir os atributos: nome, AnoDeCriação e IDE. -------");
        System.out.println(" ----- (3) exibir os dados um abaixo do outro -------");
        System.out.println();
        Set<LinguagemFavorita> minhasLinguagensFavoritas = new HashSet<>();
        minhasLinguagensFavoritas.add(new LinguagemFavorita("Python", 1991, "Pycharm"));
        minhasLinguagensFavoritas.add(new LinguagemFavorita("JavaScript", 1995, "Intellij"));
        minhasLinguagensFavoritas.add(new LinguagemFavorita("Java", 1991, "Vs Code"));
//        System.out.println(minhasLinguageensFavoritas);
        for (LinguagemFavorita linguagem: minhasLinguagensFavoritas)
            System.out.println(linguagem);


        System.out.println();
        System.out.println("-------- (4) Exibir os dados por ordem de inserção -------");
        System.out.println();
        Set<LinguagemFavorita> minhasLinguagensFavoritas1 = new LinkedHashSet<>(
                Arrays.asList(
                        new LinguagemFavorita("Python", 1991, "Pycharm"),
                        new LinguagemFavorita("JavaScript", 1995, "Intellij"),
                        new LinguagemFavorita("Java", 1991, "Vs Code")

                )
        );
        for (LinguagemFavorita linguagem: minhasLinguagensFavoritas1)
            System.out.println(linguagem);


        System.out.println();
        System.out.println("-------- (5) Ordem natural (Nome); -------");
        System.out.println();
        Set<LinguagemFavorita> minhasLinguagensFavoritas2 = new TreeSet<>(minhasLinguagensFavoritas);
        for(LinguagemFavorita linguagem: minhasLinguagensFavoritas2)
            System.out.println(linguagem);


        System.out.println();
        System.out.println("-------- (6) Ordem IDE; -------");
        System.out.println();
        Set<LinguagemFavorita> minhasLinguagensFavoritas3 = new TreeSet<LinguagemFavorita>(
                new ComparatorIde());
        minhasLinguagensFavoritas3.addAll(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem: minhasLinguagensFavoritas3)
            System.out.println(linguagem);


        System.out.println();
        System.out.println("-------- (7) Ano de criação e nome; -------");
        System.out.println();
        Set<LinguagemFavorita> minhasLinguagensFavoritas4 = new TreeSet<LinguagemFavorita>(
                new ComparatorAnoDeCriacaoNome());
        minhasLinguagensFavoritas4.addAll(minhasLinguagensFavoritas);
        for(LinguagemFavorita linguagem: minhasLinguagensFavoritas4)
            System.out.println(linguagem);


        System.out.println();
        System.out.println("-------- (8) Nome, Ano de criação e Ide; -------");
        System.out.println();
        Set<LinguagemFavorita> minhasLinguagensFavoritas5 = new TreeSet<LinguagemFavorita>(
                new CaparatorNomeAnoDeCriacaoIde());
        minhasLinguagensFavoritas5.addAll(minhasLinguagensFavoritas3);
        for(LinguagemFavorita linguagem: minhasLinguagensFavoritas5)
            System.out.println(linguagem);


    }
}

//  CRIAÇÃO DAS CLASSES AUXILIARES !!!!!!!

class LinguagemFavorita implements Comparable<LinguagemFavorita>{
    private String nome;
    private int anoDeCriacao;
    private String ide;

    public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "LinguagemFavorita{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public int compareTo(LinguagemFavorita linguagemFavorita) {
        return this.nome.compareTo(linguagemFavorita.nome);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return anoDeCriacao == that.anoDeCriacao && nome.equals(that.nome) && ide.equals(that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, ide);
    }
}

class ComparatorIde implements Comparator<LinguagemFavorita>{


    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        return lf1.getIde().compareToIgnoreCase(lf2.getIde());
    }
}

class ComparatorAnoDeCriacaoNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int anoDeCriacao = Integer.compare(lf1.getAnoDeCriacao(), lf2.getAnoDeCriacao());
        if (anoDeCriacao != 0)
            return anoDeCriacao;

        return lf1.getNome().compareToIgnoreCase(lf2.getNome());
    }
}


class CaparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int nome = lf1.getNome().compareToIgnoreCase(lf2.getNome());
        int anoDeCriacao = Integer.compare(lf1.getAnoDeCriacao(), lf2.getAnoDeCriacao() );
        if (nome!= 0)
            return nome;
        if (anoDeCriacao != 0)
            return anoDeCriacao;
        return lf1.getIde().compareToIgnoreCase(lf2.getIde());

    }
}