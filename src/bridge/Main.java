package bridge;

import bridge.canal.*;
import bridge.notificacao.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        CanalEnvio email = new EmailCanal();
        CanalEnvio sms = new SmsCanal();
        CanalEnvio whatsapp = new WhatsAppCanal();

        System.out.println("=== Notificação simples por e-mail ===");
        new NotificacaoSimples(email).notificar("cliente@exemplo.com", "Seu pedido foi enviado.");

        System.out.println("\n=== Notificação urgente por SMS ===");
        new NotificacaoUrgente(sms).notificar("+55 11 99999-0000", "Acesso suspeito detectado na sua conta");

        System.out.println("\n=== Cobrança por WhatsApp ===");
        Notificacao cobranca = new NotificacaoCobranca(whatsapp, 149.90, LocalDate.of(2026, 11, 30));
        cobranca.notificar("+55 11 98888-0000", "Sua fatura está disponível.");

        System.out.println("\n=== Mesma cobrança, trocando o canal em tempo de execução (e-mail) ===");
        cobranca.setCanal(email);
        cobranca.notificar("cliente@exemplo.com", "Sua fatura está disponível.");
    }
}
