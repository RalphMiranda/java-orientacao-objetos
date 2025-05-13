package br.com.ralph.tw.joo.desafios.modulo5.d1;

import java.util.Scanner;

/* Informe abaixo um código que contenha:

Uma classe chamada Aritmetica, que contenha um método chamado subtracao. Este método deve receber por parâmetro dois inteiros e retornar a subtração entre eles.

Uma classe chamada Sub, que herde a classe Aritmetica.

Entrada de dados

2
20 10
99 45
Saída esperada

10
54
Obs: Devido a limitações do Java, as classes definidas não podem ser públicas */
public class Desafio {
    public static void main(String[] args) {
        Aritmetica a = new Sub();	
        
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for (int i = 0; i < t; i++) {
            int valor1 = s.nextInt();
            int valor2 = s.nextInt();
            
            System.out.println(a.subtracao(valor1, valor2));
        }

        s.close();
    }
}

class Aritmetica {
    public int subtracao(int valor1, int valor2) {
        return valor1 - valor2;
    }
}

class Sub extends Aritmetica {

}
