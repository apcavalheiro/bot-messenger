package xyz.cavalheiro.bot.postparamessenger;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import xyz.cavalheiro.bot.model.mapeamentosaida.BodySaida;
import xyz.cavalheiro.bot.model.mapeamentosaida.MessageSaida;
import xyz.cavalheiro.bot.model.mapeamentosaida.RecipientSaida;
import xyz.cavalheiro.bot.model.mapeamentosaida.SenderIdEMensagem;

public class PayloadResposta {
    MensagemDeResposta mensagemDeResposta = new MensagemDeResposta();
    PostMessenger respondeMessenger = new PostMessenger();

    public void enviarMensagem(SenderIdEMensagem capturaIdEMensagem) {
        String messagingType = "RESPONSE";
        String senderId = capturaIdEMensagem.getSenderId();
        String message = capturaIdEMensagem.getReceivedMessage();
        String mensagemParaUsuario = mensagemDeResposta.manipularMensagemTexto(message);
        RecipientSaida recipientSaida = new RecipientSaida(senderId);
        MessageSaida messageSaida = new MessageSaida(mensagemParaUsuario);
        BodySaida body = new BodySaida(messagingType, recipientSaida, messageSaida);
        ObjectMapper objectMapper = new ObjectMapper();
        String payLoadResposta = "";
        try {
            payLoadResposta = objectMapper.writeValueAsString(body);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        respondeMessenger.postMessenger(payLoadResposta);
    }
}
