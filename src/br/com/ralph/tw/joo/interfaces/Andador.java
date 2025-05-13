package br.com.ralph.tw.joo.interfaces;

import br.com.ralph.tw.joo.excecoes.AceleracaoVeiculoDesligadoException;
import br.com.ralph.tw.joo.excecoes.FrenagemVeiculoDesligadoException;

public interface Andador {

    void acelerar() throws AceleracaoVeiculoDesligadoException;

    void frear() throws FrenagemVeiculoDesligadoException;
    
}
