package bridge.canal;

public class SmsCanal implements CanalEnvio {
    private static final int LIMITE = 160;

    @Override
    public void enviar(String destinatario, String titulo, String mensagem) {
        String texto = titulo + ": " + mensagem;
        if (texto.length() > LIMITE) {
            texto = texto.substring(0, LIMITE - 3) + "...";
        }
        System.out.println("[SMS] Para: " + destinatario + " | " + texto);
    }
}
