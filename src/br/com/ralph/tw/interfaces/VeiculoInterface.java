package br.com.ralph.tw.interfaces;

import br.com.ralph.tw.excecoes.AbastecimentoVeiculoLigadoException;
import br.com.ralph.tw.excecoes.AceleracaoVeiculoDesligadoException;
import br.com.ralph.tw.excecoes.FrenagemVeiculoDesligadoException;

public interface VeiculoInterface {

    void ligar();

    void desligar();

    void abastecer() throws AbastecimentoVeiculoLigadoException;

    void acelerar() throws AceleracaoVeiculoDesligadoException;

    void frear() throws FrenagemVeiculoDesligadoException;

    void preparar();
}
