package xyz.cavalheiro.bot.dialogflow;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import xyz.cavalheiro.bot.model.entradadialogflow.BodyDialogFlow;
import xyz.cavalheiro.bot.model.saidadialogflow.ContextSaida;

import static xyz.cavalheiro.bot.util.Constantes.*;

public class DialogFlow {
    private ContextSaida context;

    public DialogFlow(String context) {
        this.context = new ContextSaida(context);
    }

    public String postDialogFlow() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON_UTF8);
        httpHeaders.set(AUTHORIZATION, BEARER + TOKEN_DIALOG);
        String payload = objectMapper.writeValueAsString(this.context);
        HttpEntity<String> httpEntity = new HttpEntity<>(payload, httpHeaders);
        RestTemplate restTemplate = new RestTemplate();
        BodyDialogFlow intent = restTemplate.postForObject(URL_DIALOG, httpEntity, BodyDialogFlow.class);
        String intencao = intent.getResult().getMetadata().getIntentName();
        return intencao;
    }
}
