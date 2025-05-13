package br.com.ralph.tw.classes;

import br.com.ralph.tw.excecoes.AceleracaoVeiculoDesligadoException;
import br.com.ralph.tw.excecoes.FrenagemVeiculoDesligadoException;

public final class Moto extends Veiculo {

    public Moto() {
        this.quantidadeRodas = 2;
    }

    public Moto(String nome, String marca) {
        this.quantidadeRodas = 2;
        this.setNome(nome);
        this.setMarca(marca);
    }

    @Override
    public void acelerar() throws AceleracaoVeiculoDesligadoException {
        if (this.isLigado())
            velocidade += 15;
        else
            throw new AceleracaoVeiculoDesligadoException();
    }

    @Override
    public void frear() throws FrenagemVeiculoDesligadoException {
        if (this.isLigado()) {
            velocidade = velocidade - 15 <= 0f ? 0f : velocidade - 15;
        } else
            throw new FrenagemVeiculoDesligadoException();
    }

    @Override
    public void preparar() {
        System.out.println("Colocar o capacete!");
    }

}
