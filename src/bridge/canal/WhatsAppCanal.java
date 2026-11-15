package bridge.canal;

public class WhatsAppCanal implements CanalEnvio {
    @Override
    public void enviar(String destinatario, String titulo, String mensagem) {
        System.out.println("[WHATSAPP] Para: " + destinatario);
        System.out.println("           *" + titulo + "*");
        System.out.println("           " + mensagem);
    }
}
