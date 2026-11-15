package bridge.notificacao;

import bridge.canal.CanalEnvio;

public class NotificacaoSimples extends Notificacao {
    public NotificacaoSimples(CanalEnvio canal) {
        super(canal);
    }

    @Override
    public void notificar(String destinatario, String mensagem) {
        canal.enviar(destinatario, "Aviso", mensagem);
    }
}
