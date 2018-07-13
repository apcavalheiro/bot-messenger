package xyz.cavalheiro.bot.model.mapeamentoentrada;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import xyz.cavalheiro.bot.model.mapeamentoentrada.BodyEntrada;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SenderIdEMensagem {

    private String senderId;
    private String receivedMessage;

    public SenderIdEMensagem(BodyEntrada body) {
        this.senderId = body.getEntry().get(0).getMessaging().get(0).getSender().getId();
        this.receivedMessage = body.getEntry().get(0).getMessaging().get(0).getMessage().getText().toLowerCase();
    }

    public String getSenderId() {
        return senderId;
    }

    public String getReceivedMessage() {
        return receivedMessage;
    }

}