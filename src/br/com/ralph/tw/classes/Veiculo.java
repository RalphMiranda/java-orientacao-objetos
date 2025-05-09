package br.com.ralph.tw.classes;

public class Veiculo {

    private String nome;
    private String marca;
    private String chassi;
    private int quantidadeRodas;

    public void ligar() {
        System.out.println("O veículo ligou!");
    }

    public void desligar() {
        System.out.println("O veículo desligou!");
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

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public int getQuantidadeRodas() {
        return quantidadeRodas;
    }

    public void setQuantidadeRodas(int quantidadeRodas) {
        this.quantidadeRodas = quantidadeRodas;
    }
}
