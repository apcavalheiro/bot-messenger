package xyz.cavalheiro.bot.mensagens;

public class FaixaEtaria implements Mensagem {

    @Override
    public boolean verifica(String mensagemRecebidaDoUsuario) {
        String msg = mensagemRecebidaDoUsuario;
        return msg.contains("1") || msg.contains("2")
                || msg.contains("3") || msg.contains("4")
                || msg.contains("5") || msg.contains("6")
                || msg.contains("7") || msg.contains("8")
                || msg.contains("9");
    }

    @Override
    public String criaMensagem(String msg) {
        String mensagemDeRetorno = retornaMensagemFaixaEtaria(msg);
        return mensagemDeRetorno;
    }

    private String retornaMensagemFaixaEtaria(String mensagemContendoIdadeEmString) {
        int i = converteIdade(mensagemContendoIdadeEmString);
        String msg="";
        if (i > 59) {
            msg = mensagemContendoIdadeEmString+" anos legal! você já pertence a terceira idade deve ter muitas histórias para contar.";
        } else if (i > 29) {
            msg = mensagemContendoIdadeEmString+" anos que bacana! você já é um adulto.";
        } else if (i > 15) {
            msg = mensagemContendoIdadeEmString+" anos uauuu! você ainda é bem jovem";
        } else if (i > 1) {
            msg = mensagemContendoIdadeEmString+" anos legal! você é uma criança eu também sou criança";
        }
        return msg;
    }

    public int converteIdade(String mensagemContendoIdadeEmString) {
        int idadeConvertida = Integer.parseInt(mensagemContendoIdadeEmString);
        return idadeConvertida;
    }

}