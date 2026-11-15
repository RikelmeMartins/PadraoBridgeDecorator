package decorator.upgrade;

import decorator.arma.Arma;
import decorator.arma.TipoArma;

import java.util.EnumSet;

public class Bipe extends UpgradeDecorator {
    public Bipe(Arma arma) {
        super(arma, "Bipé", 600, EnumSet.of(TipoArma.METRALHADORA));
    }

    @Override public int getPrecisao() { return limitarPrecisao(arma.getPrecisao() + 20); }
}
