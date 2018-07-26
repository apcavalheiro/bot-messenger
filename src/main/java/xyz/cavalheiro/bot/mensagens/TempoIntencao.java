package xyz.cavalheiro.bot.mensagens;

import com.fasterxml.jackson.core.JsonProcessingException;
import xyz.cavalheiro.bot.dialogflow.DialogFlow;

public class TempoIntencao implements Mensagem{

    @Override
    public boolean verifica(String msg) {
        DialogFlow dialogFlow = new DialogFlow(msg);
        String intencao ="";
        try {
            intencao = dialogFlow.postDialogFlow();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return intencao.equals("Tempo");
    }

    @Override
    public String criaMensagem(String msg) {
        return "Informe o nome da sua cidade!";
    }
}
