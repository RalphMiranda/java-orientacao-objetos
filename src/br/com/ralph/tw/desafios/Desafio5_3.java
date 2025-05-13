package br.com.ralph.tw.desafios;

import java.util.Scanner;

public class Desafio5_3 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        while(scann.hasNextLine()) {
            Veiculo53 veiculo = new Veiculo53(scann.nextLine());
            
            veiculo.setNome(scann.nextLine());
            
            System.out.println(veiculo.getNome());
            System.out.println(veiculo.getTipo());
        }
        scann.close();
    }
}

class Veiculo53 {
    private String nome;
    
    private String tipo;

    public Veiculo53(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }
}