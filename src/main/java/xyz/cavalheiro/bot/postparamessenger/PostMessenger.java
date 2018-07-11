package xyz.cavalheiro.bot.postparamessenger;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import static xyz.cavalheiro.bot.util.Constante.URL;

public class PostMessenger {

    public void postMessenger(String json) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON_UTF8);
        HttpEntity<String> httpEntity = new HttpEntity<>(json, httpHeaders);
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForObject(URL, httpEntity, String.class);
    }
}
