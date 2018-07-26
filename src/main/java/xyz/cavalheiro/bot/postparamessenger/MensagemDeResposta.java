package xyz.cavalheiro.bot.postparamessenger;

import xyz.cavalheiro.bot.mensagens.*;

import java.util.Arrays;
import java.util.List;

public class MensagemDeResposta {

    private List<Mensagem> mensagens = Arrays.asList(new IdadeMensagem(),
            new NomeMensagem(), new FaixaEtariaMensagem(),
            new SaudacaoMensagem(), new TempoIntencao(), new TempoMensagem(), new DefaultMensagem());

    public String manipularMensagemTexto(String msg) {
        for (Mensagem mensagem : mensagens) {
            if (mensagem.verifica(msg)) {
                return mensagem.criaMensagem(msg);
            }
        }
        return "";
    }
}