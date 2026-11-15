package decorator.upgrade;

import decorator.arma.Arma;
import decorator.arma.TipoArma;

import java.util.EnumSet;

public class PenteEstendido extends UpgradeDecorator {
    public PenteEstendido(Arma arma) {
        super(arma, "Pente estendido", 900, EnumSet.of(TipoArma.PISTOLA, TipoArma.METRALHADORA));
    }

    @Override public int getCapacidadePente() { return arma.getCapacidadePente() * 2; }
    @Override public double getTempoRecarga() { return arma.getTempoRecarga() + 0.3; }
}
