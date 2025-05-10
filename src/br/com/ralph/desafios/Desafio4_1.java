package br.com.ralph.desafios;

import java.util.Arrays;

/*Defina uma classe chamada Curso() e que contenha os atributos textuais encapsulados descricao e nome.

Entrada de dados

Não há nenhuma entrada

Saída esperada

Você não será responsável pela saída.

Obs: Devido a limitações do Java, a classe definida não pode ser pública. */
public class Desafio4_1 {
    public static void main(String[] args) {
        Curso41 curso = new Curso41();
        
        curso.setNome("Java - Orientação a objetos");
        curso.setDescricao("Compreenda como os conceitos de orientação a objetos são aplicados na linguagem Java");
        
        System.out.println(curso.getNome());
        System.out.println(curso.getDescricao());
    }
}

class Curso41 {
    private String descricao;

    private String nome;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}