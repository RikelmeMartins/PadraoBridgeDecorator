package bridge.notificacao;

import bridge.canal.CanalEnvio;

public class NotificacaoUrgente extends Notificacao {
    public NotificacaoUrgente(CanalEnvio canal) {
        super(canal);
    }

    @Override
    public void notificar(String destinatario, String mensagem) {
        canal.enviar(destinatario, "!!! URGENTE !!!", mensagem.toUpperCase() + " (responda imediatamente)");
    }
}
