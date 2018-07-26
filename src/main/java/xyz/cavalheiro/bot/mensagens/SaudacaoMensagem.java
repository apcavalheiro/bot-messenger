package xyz.cavalheiro.bot.mensagens;

import com.fasterxml.jackson.core.JsonProcessingException;
import xyz.cavalheiro.bot.dialogflow.DialogFlow;

public class SaudacaoMensagem implements Mensagem {
    @Override
    public boolean verifica(String msg) {
        DialogFlow dialogFlow = new DialogFlow(msg);
        String intencao ="";
        try {
            intencao = dialogFlow.postDialogFlow();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return intencao.equals("Default Welcome Intent");
    }

    @Override
    public String criaMensagem(String msg) {
        return "Diga olá! pergunte algo como meu nome, idade ou previsão do tempo para sua cidade!";
    }
}
