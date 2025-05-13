package br.com.ralph.tw.desafios.modulo6.d2;

/* Dado uma interface Veiculo, que declara o método showTipo, defina duas classes, uma chamada Carro, 
que implementa o método da interface e exiba a mensagem "Carro" e outra chamada Moto, que implementa 
o método da interface e exibe a mensagem "Moto".

Entrada de dados

Não há nenhuma entrada

Saída esperada

Carro
Moto */
public class Desafio {

    public static void main(String[] args) {
        
        Veiculo veiculo = new Carro();
        
        veiculo.showTipo();

        veiculo = new Moto();

        veiculo.showTipo();
    }

}

interface Veiculo {
    void showTipo();
}

class Carro implements Veiculo {
    
    @Override
    public void showTipo() {
        System.out.println("Carro");
    }
}

class Moto implements Veiculo {

    @Override
    public void showTipo() {
        System.out.println("Moto");
    }
}
