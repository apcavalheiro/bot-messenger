package xyz.cavalheiro.bot.mensagens;

public class IdadeMensagem implements Mensagem {
    @Override
    public boolean verifica(String msg) {
        return msg.contains("quantos anos") || msg.contains("idade");
    }

    @Override
    public String criaMensagem(String msg){
        return "tenho 3 semanas e você, quantos anos tem?";
    }
}
