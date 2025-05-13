package br.com.ralph.tw.interfaces;

import br.com.ralph.tw.excecoes.AceleracaoVeiculoDesligadoException;
import br.com.ralph.tw.excecoes.FrenagemVeiculoDesligadoException;

public interface Andador {

    void acelerar() throws AceleracaoVeiculoDesligadoException;

    void frear() throws FrenagemVeiculoDesligadoException;
    
}
