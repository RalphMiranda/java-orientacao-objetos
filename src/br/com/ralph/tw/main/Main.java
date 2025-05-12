package br.com.ralph.tw.main;

import br.com.ralph.tw.classes.Carro;
import br.com.ralph.tw.classes.Veiculo;

public class Main {
    public static void main(String[] args) throws Exception {

        try {
            Carro veiculo1 = new Carro();
            veiculo1.setNome("Corsa");
            veiculo1.setMarca("GM");
            veiculo1.abastecer(15);
            veiculo1.setChassi("ABCDE");
            System.out.println(veiculo1.getNome());
            System.out.println(veiculo1.getQuantidadeCombustivel());
            System.out.println(veiculo1.getQuantidadeRodas());
            veiculo1.ligar();
            
            System.out.println("\n --- \n");
            
            Carro veiculo2 = new Carro("Gol", "VW");
            veiculo2.abastecer(16);
            veiculo2.setChassi("FGHIJ");
            System.out.println(veiculo2.getNome());
            System.out.println(veiculo2.getQuantidadeCombustivel());
            System.out.println(veiculo2.getQuantidadeRodas());
            veiculo2.ligar();
            
            System.out.println("\n --- \n");

            Veiculo veiculo3 = new Veiculo();
            veiculo3.setNome("Fiesta");
            veiculo3.setMarca("Ford");
            veiculo1.setChassi("ABCD");
            System.out.println(veiculo3.getNome());
            System.out.println(veiculo3.getQuantidadeCombustivel());
            veiculo3.ligar();
            
        } catch (Exception e) {
            System.out.println(String.format("** Ocorreu um erro: %s", e.getMessage()));
        }
    }
}
