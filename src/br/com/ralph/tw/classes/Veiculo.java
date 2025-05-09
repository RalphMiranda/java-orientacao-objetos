package br.com.ralph.tw.classes;

import br.com.ralph.tw.excecoes.ChassiInvalidoException;

public class Veiculo {

    private String nome;
    private String marca;
    private String chassi;
    private int quantidadeRodas;
    private float quantidadeCombustivel;

    public void ligar() {
        System.out.println("O veículo ligou!");
    }

    public void desligar() {
        System.out.println("O veículo desligou!");
    }

    public void abastecer(float litros) {
        quantidadeCombustivel += litros;
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

    public void setQuantidadeRodas(int quantidadeRodas) {
        this.quantidadeRodas = quantidadeRodas;
    }

    public float getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }
}
