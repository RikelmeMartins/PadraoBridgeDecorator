package decorator.arma;

import java.util.List;

public interface Arma {
    String getNome();
    TipoArma getTipo();
    double getDano();
    int getPrecisao();          // 0 a 100
    int getCapacidadePente();
    double getTempoRecarga();   // segundos
    int getRuido();             // decibéis
    double getPreco();          // GTA$
    List<String> getUpgrades();

    default String ficha() {
        return String.format(
                "%s [%s]%n  Dano: %.1f | Precisão: %d | Pente: %d | Recarga: %.2fs | Ruído: %ddB | Preço: GTA$ %.2f%n  Upgrades: %s",
                getNome(), getTipo(), getDano(), getPrecisao(), getCapacidadePente(),
                getTempoRecarga(), getRuido(), getPreco(),
                getUpgrades().isEmpty() ? "nenhum" : String.join(", ", getUpgrades()));
    }
}
