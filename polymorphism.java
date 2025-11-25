class MessageSender {
    String message;

    public MessageSender(String message) {
        this.message = message;
    }

    public void send(String message) {
        System.out.println("Sending message: " + message);
    }
}

class EmailSender extends MessageSender {

    public EmailSender(String message) {
        super(message);
    }

    @Override
    public void send(String message) {
        System.out.println("Email Sent: " + message);
    }
}
class SMSSender extends MessageSender {

    public SMSSender(String message) {
        super(message);
    }

    @Override
    public void send(String message) {
        System.out.println("SMS Sent: " + message);
    }
}

class PushSender extends MessageSender {

    public PushSender(String message) {
        super(message);
    }

    @Override
    public void send(String message) {
        System.out.println("Push Sent: " + message);
    }
}

class Main {
    public static void main(String[] args) {

        String message = "Hi";

        MessageSender e = new EmailSender(message);
        MessageSender s = new SMSSender(message);
        MessageSender p = new PushSender(message);

        e.send(message);
        s.send(message);
        p.send(message);
    }
}
