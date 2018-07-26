package xyz.cavalheiro.bot.model.saidamessenger;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BodySaida {

    @JsonProperty("messaging_type")
    private String messagingType;
    private RecipientSaida recipient;
    private MessageSaida message;

    public BodySaida( RecipientSaida recipient, MessageSaida message) {
        this.messagingType = "RESPONSE";
        this.recipient = recipient;
        this.message = message;
    }

    public String getMessagingType() {
        return messagingType;
    }

    public void setMessagingType(String messagingType) {
        this.messagingType = messagingType;
    }

    public RecipientSaida getRecipient() {
        return recipient;
    }

    public void setRecipient(RecipientSaida recipient) {
        this.recipient = recipient;
    }

    public MessageSaida getMessage() {
        return message;
    }

    public void setMessage(MessageSaida message) {
        this.message = message;
    }
}
