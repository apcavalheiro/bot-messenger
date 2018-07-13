package xyz.cavalheiro.bot.postparamessenger;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import xyz.cavalheiro.bot.model.mapeamentosaida.BodySaida;
import xyz.cavalheiro.bot.model.mapeamentosaida.MessageSaida;
import xyz.cavalheiro.bot.model.mapeamentosaida.RecipientSaida;
import xyz.cavalheiro.bot.model.mapeamentoentrada.SenderIdEMensagem;

public class PayloadResposta {
    MensagemDeResposta mensagemDeResposta = new MensagemDeResposta();
    PostMessenger postMessenger = new PostMessenger();

    public void enviarMensagem(SenderIdEMensagem idEMensagem) {
        String senderId = idEMensagem.getSenderId();
        String message = idEMensagem.getReceivedMessage();
        String mensagemParaUsuario = mensagemDeResposta.manipularMensagemTexto(message);
        RecipientSaida recipientSaida = new RecipientSaida(senderId);
        MessageSaida messageSaida = new MessageSaida(mensagemParaUsuario);
        BodySaida body = new BodySaida(recipientSaida, messageSaida);
        ObjectMapper objectMapper = new ObjectMapper();
        String payLoadResposta = "";
        try {
            payLoadResposta = objectMapper.writeValueAsString(body);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        postMessenger.postMessenger(payLoadResposta);
    }
}
