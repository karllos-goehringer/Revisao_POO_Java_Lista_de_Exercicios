package org.example.num3;

public class Produto {
    private final String marca;
    private final String nome;
    private Integer id;
    static private Integer idIndexer = 1;

    public Produto(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
        this.id = idIndexer;
        idIndexer++;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "marca='" + marca + '\'' +
                ", nome='" + nome + '\'' +
                ", id=" + id +
                '}';
    }
}
