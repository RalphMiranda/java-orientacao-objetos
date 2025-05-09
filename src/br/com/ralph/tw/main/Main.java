package br.com.ralph.tw.main;

import br.com.ralph.tw.classes.Veiculo;

public class Main {
    public static void main(String[] args) throws Exception {
        Veiculo veiculo1 = new Veiculo();
        veiculo1.nome = "Corsa";
        veiculo1.marca = "GM";
        
        Veiculo veiculo2 = new Veiculo();
        veiculo2.nome = "Fiesta";
        veiculo2.marca = "Ford";
        veiculo2.ligar();
    }
}
