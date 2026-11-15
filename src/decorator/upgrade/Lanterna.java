package decorator.upgrade;

import decorator.arma.Arma;
import decorator.arma.TipoArma;

import java.util.EnumSet;

public class Lanterna extends UpgradeDecorator {
    public Lanterna(Arma arma) {
        super(arma, "Lanterna tática", 300, EnumSet.of(TipoArma.PISTOLA, TipoArma.METRALHADORA));
    }

    @Override public int getPrecisao() { return limitarPrecisao(arma.getPrecisao() + 3); }
}
