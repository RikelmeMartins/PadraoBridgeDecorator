package bridge.canal;

public class EmailCanal implements CanalEnvio {
    @Override
    public void enviar(String destinatario, String titulo, String mensagem) {
        System.out.println("[E-MAIL] Para: " + destinatario);
        System.out.println("         Assunto: " + titulo);
        System.out.println("         Corpo: " + mensagem);
    }
}
