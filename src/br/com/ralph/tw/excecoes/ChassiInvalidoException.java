package br.com.ralph.tw.excecoes;

public class ChassiInvalidoException extends Exception {

    private static final long serialVersionUID = -7705692693442488259L;
    
    public ChassiInvalidoException(String chassi) {
        super(String.format("O chassi [%s] informado é inválido!", chassi));
    }
}
