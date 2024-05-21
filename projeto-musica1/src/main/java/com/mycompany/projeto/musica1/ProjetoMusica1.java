package com.mycompany.projeto.musica1;

import java.util.ArrayList;
import java.util.Scanner;

class Aula {
    String titulo;
    String descricao;
    int duracao;

    // Construtor
    public Aula(String titulo, String descricao, int duracao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.duracao = duracao;
    }

    // Métodos getters e setters
    // ...
}

// Classe principal
public class ProjetoMusica1 {
    public static void main(String[] args) {
        // Criando um ArrayList para armazenar as aulas
        ArrayList<Aula> aulas = new ArrayList<>();

        // Criando um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o título da aula:");
        String tituloAula = scanner.nextLine();

        System.out.println("Digite a descrição da aula:");
        String descricaoAula = scanner.nextLine();

        System.out.println("Digite a duração da aula (em minutos):");
        int duracaoAula = scanner.nextInt();

        // Criando uma aula
        Aula aula = new Aula(tituloAula, descricaoAula, duracaoAula);

        // Adicionando a aula ao ArrayList
        aulas.add(aula);

        // Imprimindo as informações da aula
        System.out.println("Aula criada com sucesso!");
        System.out.println("Título: " + aula.titulo);
        System.out.println("Descrição: " + aula.descricao);
        System.out.println("Duração: " + aula.duracao + " minutos");
    }
}
