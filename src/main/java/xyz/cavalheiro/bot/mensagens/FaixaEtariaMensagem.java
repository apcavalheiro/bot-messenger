package xyz.cavalheiro.bot.mensagens;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FaixaEtariaMensagem implements Mensagem {
    private static Logger logger = LogManager.getLogger(FaixaEtariaMensagem.class);

    @Override
    public boolean verifica(String mensagemRecebidaDoUsuario) {
        return verificaIdadeNumerica(mensagemRecebidaDoUsuario)
                || verificaIdadeExtenso(mensagemRecebidaDoUsuario);
    }

    @Override
    public String criaMensagem(String msg) {
        String mensagemDeRetorno = retornaMensagemFaixaEtaria(msg);
        return mensagemDeRetorno;
    }

    private boolean verificaIdadeNumerica(String mensagemRecebidaDoUsuario) {
        String msg = mensagemRecebidaDoUsuario;
        return msg.contains("1") || msg.contains("2")
                || msg.contains("3") || msg.contains("4")
                || msg.contains("5") || msg.contains("6")
                || msg.contains("7") || msg.contains("8")
                || msg.contains("9");
    }

    private boolean verificaIdadeExtenso(String mensagemRecebidaDoUsuario) {
        String msg = mensagemRecebidaDoUsuario;
        return msg.contains("dez")
                || msg.contains("cinco") || msg.contains("vinte")
                || msg.contains("trinta") || msg.contains("enta");
    }

    private String retornaMensagemFaixaEtaria(String mensagemContendoIdadeEmString) {
        int i = converteIdade(mensagemContendoIdadeEmString);
        String msg = "";
        if (i > 59) {
            msg = "Você disse " + mensagemContendoIdadeEmString + "!!!\n Que legal! você já pertence a terceira idade deve ter muitas histórias para contar.";
        } else if (i > 29) {
            msg = "Você disse " + mensagemContendoIdadeEmString + "!!!\n Que bacana! você já é um adulto.";
        } else if (i > 15) {
            msg = "Você disse " + mensagemContendoIdadeEmString + "!!!\n  Uaaauuu! você ainda é bem jovem";
        } else if (i > 1) {
            msg = "Você disse " + mensagemContendoIdadeEmString + "!!!\n Que legal! você é uma criança eu também sou criança";
        }
        return msg;
    }

    private int converteIdade(String mensagemContendoIdadeEmString) {
        int idadeConvertida = 0;
        String msg = "";
        if (verificaIdadeExtenso(mensagemContendoIdadeEmString)) {
            msg = alterarMensagemIdadePorExtenso(mensagemContendoIdadeEmString);
            idadeConvertida = Integer.parseInt(msg);
        } else {
            msg = alterarMensagemIdadeNumerica(mensagemContendoIdadeEmString);
            idadeConvertida = Integer.parseInt(msg);
        }
        return idadeConvertida;
    }

    private String alterarMensagemIdadeNumerica(String mensagemUsuario) {
        String msg = mensagemUsuario;
        String novaFrase = "";
        if (msg.contains("1")) {
            novaFrase = msg.replace(msg, "10");
        } else if (msg.contains("2")) {
            novaFrase = msg.replace(msg, "20");
        } else if (msg.contains("3")) {
            novaFrase = msg.replace(msg, "30");
        } else if (msg.contains("4")) {
            novaFrase = msg.replace(msg, "40");
        } else if (msg.contains("5")) {
            novaFrase = msg.replace(msg, "50");
        } else if (msg.contains("6")) {
            novaFrase = msg.replace(msg, "60");
        } else if (msg.contains("7")) {
            novaFrase = msg.replace(msg, "70");
        } else if (msg.contains("8")) {
            novaFrase = msg.replace(msg, "80");
        } else if (msg.contains("9")) {
            novaFrase = msg.replace(msg, "90");
        }
        return novaFrase;
    }

    private String alterarMensagemIdadePorExtenso(String mensagemUsuario) {
        String novaFrase = "";
        try {
            String msg = mensagemUsuario;
            if (msg.contains("dez")) {
                novaFrase = msg.replace(msg, "10");
            } else if (msg.contains("vinte")) {
                novaFrase = msg.replace(msg, "20");
            } else if (msg.contains("trinta")) {
                novaFrase = msg.replace(msg, "30");
            } else if (msg.contains("quarenta")) {
                novaFrase = msg.replace(msg, "40");
            } else if (msg.contains("cinquenta")) {
                novaFrase = msg.replace(msg, "50");
            } else if (msg.contains("sessenta")) {
                novaFrase = msg.replace(msg, "60");
            } else if (msg.contains("setenta")) {
                novaFrase = msg.replace(msg, "70");
            } else if (msg.contains("oitenta")) {
                novaFrase = msg.replace(msg, "80");
            } else if (msg.contains("noventa")) {
                novaFrase = msg.replace(msg, "90");
            }
        } catch (NumberFormatException e) {
            logger.error("deu merda ao replacear mensagem de usuario" + e);
        }
        return novaFrase;
    }
}