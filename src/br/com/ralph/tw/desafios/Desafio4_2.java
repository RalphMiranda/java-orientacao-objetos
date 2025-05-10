package br.com.ralph.tw.desafios;

import java.util.Scanner;

import javax.management.InvalidAttributeValueException;

/* Defina uma classe chamada Curso() e que contenha os atributos encapsulados descricao, nome e valor. Sendo que o atributo valor, 
deve ser do tipo double e não pode aceitar valores negativos. Caso seja passado um valor negativo, ele deve gerar uma exceção 
InvalidAttributeValueException.

Entrada de dados

Não há nenhuma entrada

Saída esperada

Você não será responsável pela saída.

Obs: Devido a limitações do Java, a classe definida não pode ser pública. */
public class Desafio4_2 {

    public static void main(String[] args) {
        Curso42 curso = new Curso42();
        
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()) {
            String nome = scan.nextLine();
            String descricao = scan.nextLine();
            String valor = scan.nextLine();
        
            try {
                curso.setNome(nome);
                curso.setDescricao(descricao);
                curso.setValor(Double.valueOf(valor));
                System.out.println(curso.getNome());
                System.out.println(curso.getDescricao());
                System.out.println(curso.getValor());
            } catch(Exception ex) {
                System.out.println(ex.getClass().getName());
            }
        }
        scan.close();
    }
}

class Curso42 {
    private String descricao;

    private String nome;

    private double valor;

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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) throws InvalidAttributeValueException {
        if (valor >= 0)
            this.valor = valor;
        else
            throw new InvalidAttributeValueException("Valor não pose ser negativo!");
    }   
}