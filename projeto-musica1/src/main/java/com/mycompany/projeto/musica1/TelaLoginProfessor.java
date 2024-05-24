/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.musica1;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author 202301095701
 */
public class TelaLoginProfessor extends ProjetoMusica1 {
        
        public void telaloginprof(ArrayList<Aula> a, ArrayList<Usuario> b) {
        
        Aula aula1 = new Aula("Aula 1","asasas",2);
        Aula aula2 = new Aula("Aula 2","asasas",2);
        
        a.add(aula1);
        a.add(aula2);
        
        Usuario Vinicius = new Usuario("Vinicius","vini","123");
        Usuario Pinicius = new Usuario("Pinicius","pini","123");
        
        b.add(Vinicius);
        b.add(Pinicius);
        
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
                System.out.println("1- Login 2- Cadastrar 3- Sair");

                Scanner scanner = new Scanner(System.in);
                int cursor = scanner.nextInt();

                if (cursor >= 4 || cursor <= 0) {
                    System.out.println("Tente De novo");
                }

                if (cursor == 3) {
                    teste = 1;
                }

                if (cursor == 2){
                    System.out.println("Nome:");
                    nome = scanner.next();

                    System.out.println("Username: ");
                    username = scanner.next();

                    System.out.println("Senha:");
                    senha = scanner.next();

                    usuarios.add(new Usuario(nome,username,senha));
                }

                if (cursor == 1) {
                    System.out.println("Username: ");
                    username = scanner.next();

                    System.out.println("Senha:");
                    senha = scanner.next();

                    boolean loggedIn = false;
                    for (Usuario usuario : usuarios) {
                        if (usuario.getUsername().equals(username) && usuario.getSenha().equals(senha)) {
                            loggedIn = true;
                            System.out.println("Login bem-sucedido!");

                            FoiLogado metodo = new FoiLogado();
                            metodo.telaprof(a,b);
                        }
                    }

                    if (!loggedIn) {
                        System.out.println("Falha no login. Tente novamente.");
                    }
                }
            }
    }
    
    public static void main(String[] args) {
        // Criando um ArrayList para armazenar as aula
        
        String nome = "";
        String descricao = "";
        int duracao = 0;
        
        String username;
        String senha;
     
            int teste = 0;
            while (teste == 0) {
                System.out.println("1- Login 2- Cadastrar 3- Sair");

                Scanner scanner = new Scanner(System.in);
                int cursor = scanner.nextInt();

                if (cursor >= 4 || cursor <= 0) {
                    System.out.println("Tente De novo");
                }

                if (cursor == 3) {
                    teste = 1;
                }

                if (cursor == 2){
                    System.out.println("Nome:");
                    nome = scanner.next();

                    System.out.println("Username: ");
                    username = scanner.next();

                    System.out.println("Senha:");
                    senha = scanner.next();

                    usuarios.add(new Usuario(nome,username,senha));
                }

                if (cursor == 1) {
                    System.out.println("Username: ");
                    username = scanner.next();

                    System.out.println("Senha:");
                    senha = scanner.next();

                    boolean loggedIn = false;
                    for (Usuario usuario : usuarios) {
                        if (usuario.getUsername().equals(username) && usuario.getSenha().equals(senha)) {
                            loggedIn = true;
                            System.out.println("Login bem-sucedido!");

                            FoiLogado metodo = new FoiLogado();
                            metodo.telaprof();
                        }
                    }

                    if (!loggedIn) {
                        System.out.println("Falha no login. Tente novamente.");
                    }
                }
            }
    }
}

