package br.com.ralph.tw.joo.desafios.modulo5.d3;

import java.util.Scanner;

/* Defina uma classe chamada Veículo, que contenha os atributos textuais encapsulados nome e tipo. Sendo que o atributo tipo deve ser somente leitura e receber um valor passado no construtor da classe.

Entrada de dados

Sedan
Corsa
Saída esperada

nome
tipo
Corsa
Sedan
Obs: Devido a limitações do Java, a classe definida não pode ser pública. */
public class Desafio {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        while(scann.hasNextLine()) {
            Veiculo veiculo = new Veiculo(scann.nextLine());
            
            veiculo.setNome(scann.nextLine());
            
            System.out.println(veiculo.getNome());
            System.out.println(veiculo.getTipo());
        }
        scann.close();
    }
}

class Veiculo {
    private String nome;
    
    private String tipo;

    public Veiculo(String tipo) {
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