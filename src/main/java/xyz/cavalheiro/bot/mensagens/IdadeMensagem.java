package xyz.cavalheiro.bot.mensagens;

public class IdadeMensagem implements Mensagem {
    @Override
    public boolean verifica(String msg) {
        return msg.contains("anos") || msg.contains("idade");
    }

    @Override
    public String criaMensagem(String msg){
        return "tenho 2 semanas e você? diga sua idade apenas números por favor!";
    }
}
