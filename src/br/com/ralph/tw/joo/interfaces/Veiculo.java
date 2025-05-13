package br.com.ralph.tw.joo.interfaces;

import br.com.ralph.tw.joo.excecoes.AbastecimentoVeiculoLigadoException;

public interface Veiculo {

    void abastecer(float litros) throws AbastecimentoVeiculoLigadoException;

    void preparar();

}
