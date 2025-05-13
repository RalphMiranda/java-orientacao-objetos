package br.com.ralph.tw.classes;

public final class Carro extends VeiculoBase {

    private int quantidadePortas;

    public Carro() {
        this.quantidadeRodas = 4;
    }

    public Carro(String nome, String marca) {
        this.quantidadeRodas = 4;
        this.setNome(nome);
        this.setMarca(marca);
    }
    
    @Override
    public void preparar() {
        System.out.println("Colocar o cinto de segurança!");
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

}
