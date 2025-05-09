package br.com.ralph.tw.main;

import br.com.ralph.tw.classes.Veiculo;

public class Main {
    public static void main(String[] args) throws Exception {
        Veiculo veiculo1 = new Veiculo();
        veiculo1.setNome("Corsa");
        veiculo1.setMarca("GM");
        System.out.println(veiculo1.getNome());
        veiculo1.ligar();
        
        Veiculo veiculo2 = new Veiculo();
        veiculo2.setNome("Fiesta");
        veiculo2.setMarca("Ford");
        System.out.println(veiculo2.getNome());
        veiculo2.ligar();
    }
}
