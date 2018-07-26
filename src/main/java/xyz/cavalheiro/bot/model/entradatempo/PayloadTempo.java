package xyz.cavalheiro.bot.model.entradatempo;

public class PayloadTempo {
    private String nomeDaCidade;
    private String temperatura;
    private String hora;
    private String data;
    private String descricaoClima;
    private String velocidadeDoVento;

    public PayloadTempo(BodyTempo body) {
        this.nomeDaCidade = body.getResults().getCity();
        this.temperatura = body.getResults().getTemp();
        this.hora = body.getResults().getTime();
        this.data = body.getResults().getDate();
        this.descricaoClima = body.getResults().getDescription();
        this.velocidadeDoVento = body.getResults().getWindSpeedy();
    }

    public String getNomeDaCidade() {
        return nomeDaCidade;
    }

    public void setNomeDaCidade(String nomeDaCidade) {
        this.nomeDaCidade = nomeDaCidade;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricaoClima() {
        return descricaoClima;
    }

    public void setDescricaoClima(String descricaoClima) {
        this.descricaoClima = descricaoClima;
    }

    public String getVelocidadeDoVento() {
        return velocidadeDoVento;
    }

    public void setVelocidadeDoVento(String velocidadeDoVento) {
        this.velocidadeDoVento = velocidadeDoVento;
    }

    @Override
    public String toString() {
        return "\t**** Tempo na sua Cidade Hoje ****" +
                "\n Cidade: " + nomeDaCidade +
                "\n temperatura: " + temperatura +
                "\n hora: " + hora +
                "\n data: " + data +
                "\n clima: " + descricaoClima;
    }
}