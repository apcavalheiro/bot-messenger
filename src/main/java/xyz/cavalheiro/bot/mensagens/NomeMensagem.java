package xyz.cavalheiro.bot.mensagens;

public class NomeMensagem implements Mensagem {
    @Override
    public boolean verifica(String msg) {
        return msg.contains("chama") || msg.contains("nome") || msg.contains("chamam") || msg.contains("chamamado");
    }

    @Override
    public String criaMensagem(String msg) {
        return "Meu nome é bot";
    }
}
