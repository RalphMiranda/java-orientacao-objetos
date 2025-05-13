package br.com.ralph.tw.joo.excecoes;

public class AbastecimentoVeiculoLigadoException extends Exception {

    private static final long serialVersionUID = -1508044533874068461L;

    public AbastecimentoVeiculoLigadoException() {
        super("O Veículo não pode ser abastecido enquanto estiver ligado!");
    }

}
