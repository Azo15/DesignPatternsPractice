public class UrgentContent extends Message{
    public UrgentContent(IMessageSender messageSender) {
        super(messageSender);
    }
    @Override
    public void sendMessage(String body) {
        String urgentBody = "[ACİL] \n" + body;
        messageSender.sendMessage(urgentBody);
    }
}
