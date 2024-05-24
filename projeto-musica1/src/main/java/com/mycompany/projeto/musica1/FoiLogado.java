package com.mycompany.projeto.musica1;

import java.util.ArrayList;
import java.util.Scanner;

class Aula extends TelaLoginProfessor{
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
public class FoiLogado {
    
    public void telaprof(ArrayList<Aula> a, ArrayList<Usuario> b) {
        String nome = "";
        String descricao = "";
        int duracao = 0;
        
        String username;
        String senha;
       
        int teste = 0;
        while (teste == 0) {
            System.out.println("1- Adicionar Aula 2- Listar Aula 3- Listar Alunos 4- Sair");
                                
            Scanner scanner = new Scanner(System.in);
            int cursor = scanner.nextInt();
            
            if (cursor >= 5 || cursor <= 0) {
                System.out.println("Tente De novo");
            }
            
            if (cursor == 4) {
                teste = 1;
            }
            
            if (cursor == 1) {
                System.out.println("Escreve o Titulo");
                nome = scanner.next();
                
                System.out.println("Descreve a aula");
                descricao = scanner.next();
                
                System.out.println("Da a Duracao");
                duracao = scanner.nextInt();
  
                a.add(new Aula(nome,descricao,duracao));
            }
            
            if (cursor == 2) {
               for (int x = 0 ; x < a.size() ; x++) {
                    System.out.println(a.get(x).getName());
                } 
            }
            
            if (cursor == 3) {
                for (int x = 0 ; x < b.size() ; x++) {
                    System.out.println(b.get(x).getNome());
                }
            }
        }
    }
    
    public void telaaluno() {
    }
    
    
    public static void main(String[] args) {
        // Criando um ArrayList para armazenar as aulas
        ArrayList<Aula> aulas = new ArrayList<>();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        
        Aula aula1 = new Aula("Aula 1","asasas",2);
        Aula aula2 = new Aula("Aula 2","asasas",2);
        
        aulas.add(aula1);
        aulas.add(aula2);
        
        Usuario Vinicius = new Usuario("Vinicius","vini","123");
        Usuario Pinicius = new Usuario("Pinicius","pini","123");
        
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
            System.out.println("1- Adicionar Aula 2- Listar Aula 3- Listar Alunos 4- Sair");
                                
            Scanner scanner = new Scanner(System.in);
            int cursor = scanner.nextInt();
            
            if (cursor >= 5 || cursor <= 0) {
                System.out.println("Tente De novo");
            }
            
            if (cursor == 4) {
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
            
            if (cursor == 2) {
               for (int x = 0 ; x < aulas.size() ; x++) {
                    System.out.println(aulas.get(x).getName());
                } 
            }
            
            if (cursor == 3) {
                for (int x = 0 ; x < usuarios.size() ; x++) {
                    System.out.println(usuarios.get(x).getNome());
                }
            }
        }
    }
}
