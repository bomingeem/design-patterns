package designpatterns.facade.step2;

public class Client {
    public static void main(String[] args) {
        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");
        EmailSender emailSender = new EmailSender(emailSettings);
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("whiteship@whiteship.me");
        emailMessage.setTo("keesum@whiteship.me");
        emailMessage.setCc("bomingeem");
        emailMessage.setSubject("Test Mail from Java Program");
        emailMessage.setText("message");
        emailSender.sendEmail(emailMessage);
    }
}
