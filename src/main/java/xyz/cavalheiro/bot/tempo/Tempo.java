package xyz.cavalheiro.bot.tempo;

import org.springframework.web.client.RestTemplate;
import xyz.cavalheiro.bot.model.entradatempo.BodyTempo;
import xyz.cavalheiro.bot.model.entradatempo.PayloadTempo;

import java.net.URLEncoder;

import static xyz.cavalheiro.bot.util.Constantes.KEY_TEMPO;

public class Tempo {
    private final String url;
    private String nomeCidade;

    public Tempo(String cidade) {
        this.nomeCidade = URLEncoder.encode(cidade);
        this.url = "https://api.hgbrasil.com/weather/?format=json&city_name=" + this.nomeCidade + "&key=".concat(KEY_TEMPO);
    }

    public String getTempo() {
        RestTemplate restTemplate = new RestTemplate();
        BodyTempo bodyTempo = restTemplate.getForObject(this.url, BodyTempo.class);
        PayloadTempo payloadTempo = new PayloadTempo(bodyTempo);
        return payloadTempo.toString();
    }
}
