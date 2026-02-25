public class Main {

    public static void main(String[] args) {

        Notificacao email = new Email("cliente@mensagem.com", "Promoção Especial!", "Aproveite os descontos da semana!");
        Notificacao sms = new SMS("(00) 12345-6789", "Fatura paga com sucesso!");
        Notificacao push = new Push("user_app", "Novidade!", "Você tem uma nova mensagem!");

        email.enviar();
        sms.enviar();
        push.enviar();
    }
}
