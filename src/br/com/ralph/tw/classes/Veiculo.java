package br.com.ralph.tw.classes;

import br.com.ralph.tw.excecoes.AbastecimentoVeiculoLigadoException;
import br.com.ralph.tw.excecoes.AceleracaoVeiculoDesligadoException;
import br.com.ralph.tw.excecoes.ChassiInvalidoException;
import br.com.ralph.tw.excecoes.FrenagemVeiculoDesligadoException;

public class Veiculo {

    private String nome;
    private String marca;
    private String chassi;
    protected int quantidadeRodas;
    private float quantidadeCombustivel;
    private boolean ligado;
    protected float velocidade;

    public Veiculo() {
        this.ligado = false;
    }

    public void ligar() {
        ligado = true;
        System.out.println("O veículo ligou!");
    }

    public void desligar() {
        ligado = false;
        System.out.println("O veículo desligou!");
    }

    public void abastecer(float litros) throws AbastecimentoVeiculoLigadoException {
        if (!ligado)
            quantidadeCombustivel += litros;
        else 
            throw new AbastecimentoVeiculoLigadoException();
    }

    public float acelerar() throws AceleracaoVeiculoDesligadoException {
        if (ligado)
            return velocidade += 10;
        else
            throw new AceleracaoVeiculoDesligadoException();
    }

    public float frear() throws FrenagemVeiculoDesligadoException {
        if (ligado)
            return velocidade -= 10;
        else
            throw new FrenagemVeiculoDesligadoException();
    }

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

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }
    
}
