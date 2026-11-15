package decorator.upgrade;

import decorator.arma.Arma;
import decorator.arma.TipoArma;

import java.util.EnumSet;

public class MiraLaser extends UpgradeDecorator {
    public MiraLaser(Arma arma) {
        super(arma, "Mira laser", 800, EnumSet.of(TipoArma.PISTOLA, TipoArma.METRALHADORA));
    }

    @Override public int getPrecisao() { return limitarPrecisao(arma.getPrecisao() + 10); }
}
