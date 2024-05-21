/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projeto.musica1;

/**
 *
 * @author 202301095701
 */
import java.util.ArrayList;
import java.util.Scanner;

// Classe para representar uma Partitura
class Partitura {
    String nome;
    String registradoPor;

    // Construtor
    public Partitura(String nome, String registradoPor) {
        this.nome = nome;
        this.registradoPor = registradoPor;
    }

    // Método para imprimir informações da partitura
    public void imprimirInformacoes() {
        System.out.println("Nome da Partitura: " + this.nome);
        System.out.println("Registrado por: " + this.registradoPor);
    }
}

// Classe para representar um Usuário
class Usuario {
    String nome;
    ArrayList<Partitura> partituras;

    // Construtor
    public Usuario(String nome) {
        this.nome = nome;
        this.partituras = new ArrayList<>();
    }

    // Método para adicionar partitura
    public void adicionarPartitura(Partitura partitura) {
        this.partituras.add(partitura);
    }

    // Método para imprimir partituras
    public void imprimirPartituras() {
        System.out.println("Partituras de " + this.nome + ":");
        for (Partitura partitura : this.partituras) {
            partitura.imprimirInformacoes();
        }
    }
}

// Classe para representar a Comunidade
class Comunidade {
    ArrayList<Usuario> usuarios;

    // Construtor
    public Comunidade() {
        this.usuarios = new ArrayList<>();
    }

    // Método para adicionar usuário
    public void adicionarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    // Método para encontrar usuário pelo nome
    public Usuario encontrarUsuario(String nome) {
        for (Usuario usuario : this.usuarios) {
            if (usuario.nome.equals(nome)) {
                return usuario;
            }
        }
        return null;
    }
}

// Classe principal
public class ProjetoMusica1 {
    public static void main(String[] args) {
        // Criando a comunidade
        Comunidade comunidade = new Comunidade();

        // Criando um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do usuário:");
        String nomeUsuario = scanner.nextLine();

        System.out.println("Digite o nome da partitura:");
        String nomePartitura = scanner.nextLine();

        // Criando um usuário
        Usuario usuario = new Usuario(nomeUsuario);

        // Criando uma partitura
        Partitura partitura = new Partitura(nomePartitura, nomeUsuario);

        // Adicionando partitura ao usuário
        usuario.adicionarPartitura(partitura);

        // Adicionando usuário à comunidade
        comunidade.adicionarUsuario(usuario);

        // Imprimindo o nome do primeiro usuário na comunidade
        System.out.println(comunidade.usuarios.get(0).nome);

        // Encontrando um usuário pelo nome e imprimindo suas partituras
        Usuario usuarioEncontrado = comunidade.encontrarUsuario(nomeUsuario);
        if (usuarioEncontrado != null) {
            usuarioEncontrado.imprimirPartituras();
        }
    }
}
