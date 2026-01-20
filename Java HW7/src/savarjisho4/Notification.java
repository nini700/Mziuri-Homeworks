package savarjisho4;

public abstract class Notification {
    protected String sender;
    protected String receiver;
    protected String messageText;

    public Notification(String sender, String receiver, String messageText) {
        this.sender = sender;
        this.receiver = receiver;
        this.messageText = messageText;
    }

    public abstract void send();
    public abstract void receive();
}