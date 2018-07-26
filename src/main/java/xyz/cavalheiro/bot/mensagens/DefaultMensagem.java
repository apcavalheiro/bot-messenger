package xyz.cavalheiro.bot.mensagens;

import com.fasterxml.jackson.core.JsonProcessingException;
import xyz.cavalheiro.bot.dialogflow.DialogFlow;

public class DefaultMensagem implements Mensagem {
    @Override
    public boolean verifica(String msg) {
        DialogFlow dialogFlow = new DialogFlow(msg);
        String intencao ="";
        try {
            intencao = dialogFlow.postDialogFlow();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return intencao.equals("Default Fallback Intent");
    }

    @Override
    public String criaMensagem(String msg) {
        return "Desculpe não compreendi, repita por gentileza!";
    }
}
