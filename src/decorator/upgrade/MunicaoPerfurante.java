package decorator.upgrade;

import decorator.arma.Arma;
import decorator.arma.TipoArma;

import java.util.EnumSet;

public class MunicaoPerfurante extends UpgradeDecorator {
    public MunicaoPerfurante(Arma arma) {
        super(arma, "Munição perfurante", 2_000, EnumSet.of(TipoArma.PISTOLA, TipoArma.METRALHADORA));
    }

    @Override public double getDano() { return arma.getDano() * 1.25; }
}
