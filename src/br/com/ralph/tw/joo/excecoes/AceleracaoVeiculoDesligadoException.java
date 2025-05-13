package br.com.ralph.tw.joo.excecoes;

public class AceleracaoVeiculoDesligadoException extends Exception {
    
    private static final long serialVersionUID = -1196063618336325247L;
    
    public AceleracaoVeiculoDesligadoException() {
        super("O veículo não pode ser acelarado esquanto estiver desligado!");
    }

}
