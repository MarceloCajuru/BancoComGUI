package model;

public class Produto {

    private String nome;
    private Double preço;

    public Produto(String nome, Double preço) {
        this.nome = nome;
        this.preço = preço;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preço +
                "}";
    }


}

