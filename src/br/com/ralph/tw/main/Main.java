package br.com.ralph.tw.main;

import br.com.ralph.tw.classes.Carro;
import br.com.ralph.tw.classes.Moto;
import br.com.ralph.tw.classes.Veiculo;
import br.com.ralph.tw.excecoes.AbastecimentoVeiculoLigadoException;
import br.com.ralph.tw.excecoes.ChassiInvalidoException;

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
            
            Veiculo veiculo2 = new Carro("Gol", "VW");
            veiculo2.abastecer(16);
            veiculo2.setChassi("FGHIJ");
            ((Carro)veiculo2).setQuantidadePortas(4);
            System.out.println(veiculo2.getNome());
            System.out.println(veiculo2.getQuantidadeCombustivel());
            System.out.println(veiculo2.getQuantidadeRodas());
            veiculo2.preparar();
            System.out.println(String.format("O veículo está ligado? %b", veiculo2.isLigado()));
            veiculo2.ligar();
            System.out.println(String.format("O veículo está ligado? %b", veiculo2.isLigado()));
            System.out.println(String.format("Velocidade: %f",veiculo2.getVelocidade()));
            veiculo2.acelerar();
            System.out.println(String.format("Velocidade: %f",veiculo2.getVelocidade()));
            veiculo2.frear();
            System.out.println(String.format("Velocidade: %f",veiculo2.getVelocidade()));
            
            System.out.println("\n --- \n");

            Moto moto1 = new Moto();
            moto1.setNome("Fazer");
            moto1.setMarca("Yamaha");

            System.out.println("\n --- \n");

            Veiculo moto2 = new Moto("Ninja", "Kawazaki");
            System.out.println(moto2.getNome());
            System.out.println(moto2.getQuantidadeRodas());
            System.out.println(String.format("O veículo está ligado? %b", moto2.isLigado()));
            moto2.preparar();
            moto2.ligar();
            moto2.frear();
            System.out.println(String.format("Velocidade: %f",moto2.getVelocidade()));

            System.out.println("\n --- \n");

            //Veiculo veiculo3 = new Veiculo();
            Veiculo veiculo3 = new Carro();
            veiculo3.setNome("Fiesta");
            veiculo3.setMarca("Ford");
            System.out.println(veiculo3.getNome());
            System.out.println(veiculo3.getQuantidadeCombustivel());
            veiculo1.setChassi("ABCD");
            veiculo3.ligar();
            
        } catch (ChassiInvalidoException cie) {
            System.out.println(String.format("** Ocorreu um erro: %s", cie.getMessage()));
        } catch (AbastecimentoVeiculoLigadoException avle) {
            System.out.println(String.format("** Ocorreu um erro: %s", avle.getMessage()));
        } catch (Exception e) {
            System.out.println(String.format("** Ocorreu um erro: %s", e.getMessage()));
        }
    }
}
