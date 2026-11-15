package decorator.arma;

import java.util.List;

public abstract class ArmaBase implements Arma {
    private final String nome;
    private final TipoArma tipo;
    private final double dano;
    private final int precisao;
    private final int capacidadePente;
    private final double tempoRecarga;
    private final int ruido;
    private final double preco;

    protected ArmaBase(String nome, TipoArma tipo, double dano, int precisao,
                       int capacidadePente, double tempoRecarga, int ruido, double preco) {
        this.nome = nome;
        this.tipo = tipo;
        this.dano = dano;
        this.precisao = precisao;
        this.capacidadePente = capacidadePente;
        this.tempoRecarga = tempoRecarga;
        this.ruido = ruido;
        this.preco = preco;
    }

    @Override public String getNome() { return nome; }
    @Override public TipoArma getTipo() { return tipo; }
    @Override public double getDano() { return dano; }
    @Override public int getPrecisao() { return precisao; }
    @Override public int getCapacidadePente() { return capacidadePente; }
    @Override public double getTempoRecarga() { return tempoRecarga; }
    @Override public int getRuido() { return ruido; }
    @Override public double getPreco() { return preco; }
    @Override public List<String> getUpgrades() { return List.of(); }
}
