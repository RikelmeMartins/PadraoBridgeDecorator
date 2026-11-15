package decorator.upgrade;

import decorator.arma.Arma;
import decorator.arma.TipoArma;

import java.util.EnumSet;

public class MisselTeleguiado extends UpgradeDecorator {
    public MisselTeleguiado(Arma arma) {
        super(arma, "Míssil teleguiado", 8_000, EnumSet.of(TipoArma.BAZUCA));
    }

    @Override public int getPrecisao() { return limitarPrecisao(arma.getPrecisao() + 35); }
}
