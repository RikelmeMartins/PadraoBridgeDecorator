package decorator.upgrade;

import decorator.arma.Arma;
import decorator.arma.TipoArma;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public abstract class UpgradeDecorator implements Arma {
    protected final Arma arma;
    private final String nomeUpgrade;
    private final double custo;

    protected UpgradeDecorator(Arma arma, String nomeUpgrade, double custo, Set<TipoArma> compativeis) {
        if (!compativeis.contains(arma.getTipo())) {
            throw new UpgradeInvalidoException(
                    "Upgrade inválido: '" + nomeUpgrade + "' não pode ser instalado em " + arma.getNome()
                            + " (compatível com: " + compativeis + ").");
        }
        if (arma.getUpgrades().contains(nomeUpgrade)) {
            throw new UpgradeInvalidoException(
                    "Upgrade inválido: " + arma.getNome() + " já possui '" + nomeUpgrade + "'.");
        }
        this.arma = arma;
        this.nomeUpgrade = nomeUpgrade;
        this.custo = custo;
    }

    protected static int limitarPrecisao(int valor) {
        return Math.max(0, Math.min(100, valor));
    }

    @Override public String getNome() { return arma.getNome(); }
    @Override public TipoArma getTipo() { return arma.getTipo(); }
    @Override public double getDano() { return arma.getDano(); }
    @Override public int getPrecisao() { return arma.getPrecisao(); }
    @Override public int getCapacidadePente() { return arma.getCapacidadePente(); }
    @Override public double getTempoRecarga() { return arma.getTempoRecarga(); }
    @Override public int getRuido() { return arma.getRuido(); }
    @Override public double getPreco() { return arma.getPreco() + custo; }

    @Override
    public List<String> getUpgrades() {
        List<String> lista = new ArrayList<>(arma.getUpgrades());
        lista.add(nomeUpgrade);
        return Collections.unmodifiableList(lista);
    }
}
