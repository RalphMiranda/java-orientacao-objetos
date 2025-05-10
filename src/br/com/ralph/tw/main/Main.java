package br.com.ralph.tw.main;

import br.com.ralph.tw.classes.Veiculo;

public class Main {
    public static void main(String[] args) throws Exception {

        try {
            Veiculo veiculo1 = new Veiculo();
            veiculo1.setNome("Corsa");
            veiculo1.setMarca("GM");
            veiculo1.abastecer(15);
            veiculo1.setChassi("ABCDE");
            System.out.println(veiculo1.getNome());
            System.out.println(veiculo1.getQuantidadeCombustivel());
            veiculo1.ligar();
            
            System.out.println("\n --- \n");

            Veiculo veiculo2 = new Veiculo();
            veiculo2.setNome("Fiesta");
            veiculo2.setMarca("Ford");
            veiculo1.setChassi("ABCD");
            System.out.println(veiculo2.getNome());
            System.out.println(veiculo2.getQuantidadeCombustivel());
            veiculo2.ligar();
        } catch (Exception e) {
            System.out.println(String.format("** Ocorreu um erro: %s", e.getMessage()));
        }
    }
}
