public class SmsSender implements IMessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sms ile Mesaj Gonderiliyor...\n" + message);
    }
}
