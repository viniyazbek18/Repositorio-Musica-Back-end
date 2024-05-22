/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.musica1;

import java.util.ArrayList;
/**
 *
 * @author 202301095701
 */
public class Usuario {
    private String nome;
    private String username;
    private String senha;
    ArrayList<Object> AulaPrivadas = new ArrayList<>();

    public Usuario(String nome, String username, String senha) {
        this.nome = nome;
        this.username = username;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void addAula(Object aula) {
        AulaPrivadas.add(aula);
    }
    
    public void listar() {
        System.out.println(AulaPrivadas.get(0));
    }
        
}

