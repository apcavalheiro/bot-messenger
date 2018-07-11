package xyz.cavalheiro.bot.model.mapeamentoentrada;

public class Messaging {

    private Sender sender;
    private Message message;

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
