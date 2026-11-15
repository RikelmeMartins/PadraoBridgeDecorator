package bridge.notificacao;

import bridge.canal.CanalEnvio;

public abstract class Notificacao {
    protected CanalEnvio canal;

    protected Notificacao(CanalEnvio canal) {
        this.canal = canal;
    }

    /** Permite trocar o canal em tempo de execução. */
    public void setCanal(CanalEnvio canal) {
        this.canal = canal;
    }

    public abstract void notificar(String destinatario, String mensagem);
}
