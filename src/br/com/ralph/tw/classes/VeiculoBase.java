package br.com.ralph.tw.classes;

import br.com.ralph.tw.excecoes.AbastecimentoVeiculoLigadoException;
import br.com.ralph.tw.excecoes.AceleracaoVeiculoDesligadoException;
import br.com.ralph.tw.excecoes.ChassiInvalidoException;
import br.com.ralph.tw.excecoes.FrenagemVeiculoDesligadoException;
import br.com.ralph.tw.interfaces.Andador;
import br.com.ralph.tw.interfaces.Ligador;
import br.com.ralph.tw.interfaces.Veiculo;

public abstract class VeiculoBase implements Veiculo, Andador, Ligador {

    private String nome;
    private String marca;
    private String chassi;
    protected int quantidadeRodas;
    private float quantidadeCombustivel;
    private boolean ligado;
    protected float velocidade;

    public VeiculoBase() {
        this.ligado = false;
    }

    public final void ligar() {
        ligado = true;
        System.out.println("O veículo ligou!");
    }

    public final void desligar() {
        ligado = false;
        System.out.println("O veículo desligou!");
    }

    public final void abastecer(float litros) throws AbastecimentoVeiculoLigadoException {
        if (!ligado)
            quantidadeCombustivel += litros;
        else 
            throw new AbastecimentoVeiculoLigadoException();
    }

    public void acelerar() throws AceleracaoVeiculoDesligadoException {
        if (ligado)
            velocidade += 10;
        else
            throw new AceleracaoVeiculoDesligadoException();
    }

    public void frear() throws FrenagemVeiculoDesligadoException {
        if (ligado) {
            velocidade = velocidade - 10 <= 0f ? 0f : velocidade - 10;
        } else
            throw new FrenagemVeiculoDesligadoException();
    }

    public abstract void preparar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) throws Exception { 
        if (chassi.length() == 5)
            this.chassi = chassi;
        else
            throw new ChassiInvalidoException(chassi);
    }

    public int getQuantidadeRodas() {
        return quantidadeRodas;
    }

    public float getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public boolean isLigado() {
        return ligado;
    }

    public float getVelocidade() {
        return velocidade;
    }
    
}
