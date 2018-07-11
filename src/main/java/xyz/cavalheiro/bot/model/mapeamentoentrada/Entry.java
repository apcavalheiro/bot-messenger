package xyz.cavalheiro.bot.model.mapeamentoentrada;

import java.util.List;

public class Entry {

    private List<Messaging> messaging;

    public List<Messaging> getMessaging() {
        return messaging;
    }

    public void setMessaging(List<Messaging> input) {
        this.messaging = input;
    }
}