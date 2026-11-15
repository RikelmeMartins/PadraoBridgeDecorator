package decorator;

import decorator.arma.*;
import decorator.upgrade.*;

import java.util.function.Supplier;

/**
 * Com Decorator, cada upgrade é uma camada que envolve a arma.
 * 3 armas + 12 upgrades = 15 classes, em vez de uma classe para cada
 * combinação possível (que seriam milhares).
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===== MONTAGENS VÁLIDAS =====\n");

        Arma pistola = new Pistola();
        System.out.println(pistola.ficha() + "\n");

        Arma pistolaFurtiva = new MunicaoPerfurante(
                new MiraLaser(new Lanterna(new Silenciador(new Pistola()))));
        System.out.println(pistolaFurtiva.ficha() + "\n");

        Arma metralhadora = new Bipe(new Empunhadura(new CargaRapida(
                new PenteEstendido(new CanoLongo(new Mira(new Metralhadora()))))));
        System.out.println(metralhadora.ficha() + "\n");

        Arma bazuca = new MisselTeleguiado(new OgivaTermobarica(
                new CargaRapida(new Mira(new Bazuca()))));
        System.out.println(bazuca.ficha() + "\n");

        System.out.println("===== TENTATIVAS INVÁLIDAS =====\n");
        tentar(() -> new Silenciador(new Bazuca()));
        tentar(() -> new PenteEstendido(new Bazuca()));
        tentar(() -> new Bipe(new Pistola()));
        tentar(() -> new Empunhadura(new Pistola()));
        tentar(() -> new OgivaTermobarica(new Metralhadora()));
        tentar(() -> new MisselTeleguiado(new Pistola()));
        tentar(() -> new Mira(new Mira(new Metralhadora())));
    }

    private static void tentar(Supplier<Arma> montagem) {
        try {
            Arma arma = montagem.get();
            System.out.println("OK: " + arma.ficha());
        } catch (UpgradeInvalidoException e) {
            System.out.println("X " + e.getMessage());
        }
    }
}
