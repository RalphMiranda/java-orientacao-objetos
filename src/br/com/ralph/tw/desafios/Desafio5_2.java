package br.com.ralph.tw.desafios;

import java.util.Scanner;

/* Informe abaixo uma classe chamada Veículo, que contenha os atributos textuais protegidos nome e tipo.

Entrada de dados

Corsa
Sedan
Saída esperada

nome
tipo
Corsa
Sedan
Obs: Devido a limitações do Java, a classe definida não pode ser pública. */
public class Desafio5_2 {
    public static void main(String[] args) {
        
        Carro carro = new Carro();
        
        Scanner scann = new Scanner(System.in);
        while(scann.hasNextLine()) {
            carro.setNome(scann.nextLine());
            carro.setTipo(scann.nextLine());
            
            System.out.println(carro.getNome());
            System.out.println(carro.getTipo());
        }

        scann.close();
    }
}

class Veiculo {
    protected String nome;
    protected String tipo;
}

class Carro extends Veiculo {
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

