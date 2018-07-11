package xyz.cavalheiro.bot.mensagens;

public class DefaultMensagem implements Mensagem {
    @Override
    public boolean verifica(String msg) {
        return true;
    }

    @Override
    public String criaMensagem(String msg) {
        return "Diga Olá! Vamos nos conhecer? Pergunte algo como meu nome ou idade!";
    }
}
