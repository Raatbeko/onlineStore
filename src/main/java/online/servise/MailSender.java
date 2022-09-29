package online.servise;

public interface MailSender {

    void sendEmailToAdmin(String reviewBasket, String dataUser);

    void send(String massage, String email);
}
