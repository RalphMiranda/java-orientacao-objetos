package br.com.ralph.tw.excecoes;

public class AbastecimentoVeiculoLigadoException extends Exception {

    public AbastecimentoVeiculoLigadoException() {
        super("O Veículo não pode ser abastecido enquanto estiver ligado!");
    }

}
