package br.com.ralph.desafios;

/* Defina uma classe chamada PrimeiraClasse(), que contenha um método chamado ola() que exibe no console a mensagem:

"Bem-vindo a orientação à objetos"
Entrada de dados

Não há nenhuma entrada

Saída esperada

Bem-vindo a orientação à objetos
Obs: Devido a limitações do Java, a classe definida não pode ser pública. */
public class Desafio3_1 {
    public static void main(String[] args) {
        PrimeiraClasse primeiraClasse = new PrimeiraClasse();
        primeiraClasse.ola();
    }
}

class PrimeiraClasse {
    public void ola() {
        System.out.println("Bem-vindo a orientação a objetos");
    }
}
