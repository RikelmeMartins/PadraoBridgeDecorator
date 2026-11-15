package decorator.upgrade;

import decorator.arma.Arma;
import decorator.arma.TipoArma;

import java.util.EnumSet;

public class Empunhadura extends UpgradeDecorator {
    public Empunhadura(Arma arma) {
        super(arma, "Empunhadura frontal", 700, EnumSet.of(TipoArma.METRALHADORA, TipoArma.BAZUCA));
    }

    @Override public int getPrecisao() { return limitarPrecisao(arma.getPrecisao() + 8); }
}
