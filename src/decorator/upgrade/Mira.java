package decorator.upgrade;

import decorator.arma.Arma;
import decorator.arma.TipoArma;

import java.util.EnumSet;

public class Mira extends UpgradeDecorator {
    public Mira(Arma arma) {
        super(arma, "Mira telescópica", 1_500, EnumSet.of(TipoArma.PISTOLA, TipoArma.METRALHADORA, TipoArma.BAZUCA));
    }

    @Override public int getPrecisao() { return limitarPrecisao(arma.getPrecisao() + 15); }
}
