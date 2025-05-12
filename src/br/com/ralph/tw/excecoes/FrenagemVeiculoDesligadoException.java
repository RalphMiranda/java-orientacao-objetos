package br.com.ralph.tw.excecoes;

public class FrenagemVeiculoDesligadoException extends Exception {

    private static final long serialVersionUID = 928629419045524649L;

    public FrenagemVeiculoDesligadoException() {
        super("O veículo não pode ser freado enquanto desligado!");
    }

}
