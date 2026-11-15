package decorator.upgrade;

import decorator.arma.Arma;
import decorator.arma.TipoArma;

import java.util.EnumSet;

public class CanoLongo extends UpgradeDecorator {
    public CanoLongo(Arma arma) {
        super(arma, "Cano longo", 1_000, EnumSet.of(TipoArma.PISTOLA, TipoArma.METRALHADORA));
    }

    @Override public double getDano() { return arma.getDano() * 1.10; }
    @Override public int getPrecisao() { return limitarPrecisao(arma.getPrecisao() + 5); }
}
