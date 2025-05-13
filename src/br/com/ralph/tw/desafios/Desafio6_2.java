package br.com.ralph.tw.desafios;

/* Dado uma interface Veiculo, que declara o método showTipo, defina duas classes, uma chamada Carro, 
que implementa o método da interface e exiba a mensagem "Carro" e outra chamada Moto, que implementa 
o método da interface e exibe a mensagem "Moto".

Entrada de dados

Não há nenhuma entrada

Saída esperada

Carro
Moto */
public class Desafio6_2 {

    public static void main(String[] args) {
        
        Veiculo62 veiculo = new Carro62();
        
        veiculo.showTipo();

        veiculo = new Moto62();

        veiculo.showTipo();
    }

}

interface Veiculo62 {
    void showTipo();
}

class Carro62 implements Veiculo62 {
    
    @Override
    public void showTipo() {
        System.out.println("Carro");
    }
}

class Moto62 implements Veiculo62 {

    @Override
    public void showTipo() {
        System.out.println("Moto");
    }
}
