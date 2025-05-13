package br.com.ralph.tw.interfaces;

import br.com.ralph.tw.excecoes.AbastecimentoVeiculoLigadoException;

public interface Veiculo {

    void abastecer(float litros) throws AbastecimentoVeiculoLigadoException;

    void preparar();

}
