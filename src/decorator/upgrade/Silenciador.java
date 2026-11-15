package decorator.upgrade;

import decorator.arma.Arma;
import decorator.arma.TipoArma;

import java.util.EnumSet;

public class Silenciador extends UpgradeDecorator {
    public Silenciador(Arma arma) {
        super(arma, "Silenciador", 1_200, EnumSet.of(TipoArma.PISTOLA, TipoArma.METRALHADORA));
    }

    @Override public int getRuido() { return (int) Math.round(arma.getRuido() * 0.3); }
    @Override public double getDano() { return arma.getDano() * 0.95; }
}
