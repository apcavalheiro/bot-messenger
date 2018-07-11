package xyz.cavalheiro.bot.mensagens;

public interface Mensagem {
    boolean verifica(String msg);
    String criaMensagem(String msg);
}
