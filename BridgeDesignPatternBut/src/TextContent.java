public class TextContent extends Message{
    public TextContent(IMessageSender messageSender){
        super(messageSender);
    }

    @Override
    public void sendMessage(String body) {
        messageSender.sendMessage(body);
    }
}
