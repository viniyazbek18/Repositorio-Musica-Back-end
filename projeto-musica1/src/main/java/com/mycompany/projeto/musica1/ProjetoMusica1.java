package com.mycompany.projeto.musica1;

import java.util.ArrayList;
import java.util.Scanner;

class Aula {
    private String titulo;
    private String descricao;
    private int duracao;
    


    // Construtor
    public Aula(String titulo, String descricao, int duracao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.duracao = duracao;
    }
    
    public String getName() {
        return titulo;
    }

    // Métodos getters e setters
    // ...
}

// Classe principal
public class ProjetoMusica1 {
    public static void main(String[] args) {
        // Criando um ArrayList para armazenar as aulas
        ArrayList<Aula> aulas = new ArrayList<>();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        
        Aula aula1 = new Aula("Aula 1","asasas",2);
        Aula aula2 = new Aula("Aula 2","asasas",2);
        
        aulas.add(aula1);
        aulas.add(aula2);
        
        Usuario Vinicius = new Usuario("Vinicius","vini24","1234");
        Usuario Pinicius = new Usuario("Pinicius","vini24","1234");
        
        usuarios.add(Vinicius);
        usuarios.add(Pinicius);
        
        Vinicius.addAula(aula1);
        Pinicius.addAula(aula2);

        Vinicius.listar();
        
        String nome = "";
        String descricao = "";
        int duracao = 0;
        
        String username;
        String senha;
       
        int teste = 0;
        while (teste == 0) {
            System.out.println("1- Adicionar Aula 2- Adicionar Aluno 3- Listar Aula 4- Listar Alunos 5- Login 6- Sair");
                                
            Scanner scanner = new Scanner(System.in);
            int cursor = scanner.nextInt();
            
            if (cursor >= 7 || cursor <= 0) {
                System.out.println("Tente De novo");
            }
            
            if (cursor == 6) {
                teste = 1;
            }
            
            if (cursor == 1) {
                System.out.println("Escreve o Titulo");
                nome = scanner.next();
                
                System.out.println("Descreve a aula");
                descricao = scanner.next();
                
                System.out.println("Da a Duracao");
                duracao = scanner.nextInt();
  
                aulas.add(new Aula(nome,descricao,duracao));
            }
            
            if (cursor == 3) {
               for (int x = 0 ; x < aulas.size() ; x++) {
                    System.out.println(aulas.get(x).getName());
                } 
            }
            
            if (cursor == 4) {
                for (int x = 0 ; x < usuarios.size() ; x++) {
                    System.out.println(usuarios.get(x).getNome());
                }
            }
        }
    }
}
