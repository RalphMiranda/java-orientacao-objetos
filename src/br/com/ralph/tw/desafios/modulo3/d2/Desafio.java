package br.com.ralph.tw.desafios.modulo3.d2;

/* Defina uma classe chamada PrimeiraClasse() e que contenha os atributos textuais descricao e curso.

Entrada de dados

Não há nenhuma entrada

Saída esperada

Você não será responsável pela saída.

Obs: Devido a limitações do Java, a classe definida não pode ser pública. */
public class Desafio {
    public static void main(String[] args) {
        SegundaClasse segundaClasse = new SegundaClasse();
        segundaClasse.curso = "Java - Orientação a objetos";
        segundaClasse.descricao = "Desafio do curso de Java Orientação a Objetos";

        System.out.println(segundaClasse.curso);
        System.out.println(segundaClasse.descricao);
    }
}

class SegundaClasse {
    public String curso;
    public String descricao;
}
