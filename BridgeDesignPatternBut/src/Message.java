public abstract class Message {
    protected IMessageSender messageSender;
    protected Message(IMessageSender messageSender) {
        this.messageSender=messageSender;
    }
    public abstract void sendMessage(String body);
}
