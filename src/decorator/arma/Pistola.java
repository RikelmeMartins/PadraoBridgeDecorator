package decorator.arma;

public class Pistola extends ArmaBase {
    public Pistola() {
        super("Pistola", TipoArma.PISTOLA, 25, 60, 12, 1.5, 150, 2_500);
    }
}
