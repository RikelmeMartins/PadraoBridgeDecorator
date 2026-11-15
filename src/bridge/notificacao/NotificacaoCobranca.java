package bridge.notificacao;

import bridge.canal.CanalEnvio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class NotificacaoCobranca extends Notificacao {
    private final double valor;
    private final LocalDate vencimento;

    public NotificacaoCobranca(CanalEnvio canal, double valor, LocalDate vencimento) {
        super(canal);
        this.valor = valor;
        this.vencimento = vencimento;
    }

    @Override
    public void notificar(String destinatario, String mensagem) {
        String detalhes = String.format(Locale.of("pt", "BR"),
                "%s Valor: R$ %.2f | Vencimento: %s",
                mensagem, valor, vencimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        canal.enviar(destinatario, "Cobrança", detalhes);
    }
}
