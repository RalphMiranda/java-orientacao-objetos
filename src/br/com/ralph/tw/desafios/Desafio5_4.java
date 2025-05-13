package br.com.ralph.tw.desafios;

/* Informe abaixo uma classe chamada Moto, que sobrescreva o método getTipo da superclasse e retorne "Classe do tipo Moto".

Entrada de dados

Não há nenhuma entrada

Saída esperada

"Classe do tipo Moto"

Obs: Devido a limitações do Java, a classe definida não pode ser pública. */
public class Desafio5_4 {
    public static void main(String[] args) {
        Veiculo54 veiculo = new Moto();
        System.out.println(veiculo.getTipo());
    }
}

class Veiculo54 {
    private String nome;

    private String tipo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

class Moto extends Veiculo54 {
    @Override
    public String getTipo() {
        return "Classe do tipo Moto";
    }
}
