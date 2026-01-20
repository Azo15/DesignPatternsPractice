public class EmailSender implements IMessageSender{
    @Override
    public void sendMessage(String message) {
        System.out.println("Email ile Mesaj Gonderiliyor...\n" + message);
    }
}
