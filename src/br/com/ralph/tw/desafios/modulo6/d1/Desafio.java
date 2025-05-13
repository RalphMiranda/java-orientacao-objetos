package br.com.ralph.tw.desafios.modulo6.d1;

import java.util.Scanner;

/* Dado uma interface Aritmetica, que define o método divisao_soma, defina uma classe chamada Calculadora que implementa esta classe e retorna a soma dos divisores de um valor.

Por exemplo, os divisores do valor 6 é 1, 2, 3 e 6, a soma desses valores é 12.

Entrada de dados

6
Saída esperada

Implementei: Artimetica
12
 */
public class Desafio {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        System.out.println("Implementei: Aritmetica");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(calculadora.divisao_soma(n));

        scanner.close();
    }
}

interface Aritmetica {
    int divisao_soma(int n);
}

class Calculadora implements Aritmetica {

    @Override
    public int divisao_soma(int n) {
        int soma = 0;
        for(int divisor = 1; divisor <= n; divisor++) {
            if(n % divisor == 0) {
                soma += divisor;
            }
        }
        
        return soma;
    }
    
}
