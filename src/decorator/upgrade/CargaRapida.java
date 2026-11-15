package decorator.upgrade;

import decorator.arma.Arma;
import decorator.arma.TipoArma;

import java.util.EnumSet;

public class CargaRapida extends UpgradeDecorator {
    public CargaRapida(Arma arma) {
        super(arma, "Carga rápida", 1_100, EnumSet.of(TipoArma.PISTOLA, TipoArma.METRALHADORA, TipoArma.BAZUCA));
    }

    @Override public double getTempoRecarga() { return arma.getTempoRecarga() * 0.6; }
}
