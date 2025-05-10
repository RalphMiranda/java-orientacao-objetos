package br.com.ralph.tw.excecoes;

public class ChassiInvalidoException extends Exception {
    
    public ChassiInvalidoException(String chassi) {
        super(String.format("O chassi [%s] informado é inválido!", chassi));
    }
}
