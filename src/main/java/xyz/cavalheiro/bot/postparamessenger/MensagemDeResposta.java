package xyz.cavalheiro.bot.postparamessenger;

import xyz.cavalheiro.bot.mensagens.*;
import java.util.Arrays;
import java.util.List;

public class MensagemDeResposta {

    private List<Mensagem> mensagens = Arrays.asList(new IdadeMensagem(),
            new NomeMensagem(), new FaixaEtaria(), new DefaultMensagem());

    public String manipularMensagemTexto(String msg) {
        String mensagemParaUsuario = "";
        for (Mensagem mensagem : mensagens) {
            if (mensagem.verifica(msg)) {
                mensagemParaUsuario = mensagem.criaMensagem(msg);
                break;
            }
        }
        return mensagemParaUsuario;
    }
}