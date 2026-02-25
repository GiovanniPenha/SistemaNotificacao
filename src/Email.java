public class Email extends Notificacao {

    private String assunto;

    public Email (String destinatario, String assunto, String mensagem){
        super(destinatario, mensagem);
        this.assunto = assunto;
    }

    @Override
    void enviar() {
        System.out.println("Enviando E-mail para: " + getDestinatario());
        System.out.println("Assunto: " + assunto);
        System.out.println("Corpo: " + getMensagem());
        System.out.println();
    }
}
