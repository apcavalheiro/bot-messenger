package xyz.cavalheiro.bot.mensagens;

import com.fasterxml.jackson.core.JsonProcessingException;
import xyz.cavalheiro.bot.dialogflow.DialogFlow;
import xyz.cavalheiro.bot.tempo.Tempo;

public class TempoMensagem implements Mensagem {
    @Override
    public boolean verifica(String msg) {
        DialogFlow dialogFlow = new DialogFlow(msg);
        String intencao ="";
        try {
            intencao = dialogFlow.postDialogFlow();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return intencao.equals("Cidade");
    }

    @Override
    public String criaMensagem(String msg) {
        Tempo tempo = new Tempo(msg);
        return tempo.getTempo();
    }

}
