package decorator.upgrade;

import decorator.arma.Arma;
import decorator.arma.TipoArma;

import java.util.EnumSet;

public class OgivaTermobarica extends UpgradeDecorator {
    public OgivaTermobarica(Arma arma) {
        super(arma, "Ogiva termobárica", 5_000, EnumSet.of(TipoArma.BAZUCA));
    }

    @Override public double getDano() { return arma.getDano() * 1.5; }
}
