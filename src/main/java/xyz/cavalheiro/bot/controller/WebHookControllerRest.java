package xyz.cavalheiro.bot.controller;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import xyz.cavalheiro.bot.model.entradamessenger.BodyEntrada;
import xyz.cavalheiro.bot.postparamessenger.PayloadResposta;
import xyz.cavalheiro.bot.model.entradamessenger.SenderIdEMensagem;

@RestController
@RequestMapping(value = "/bot")
public class WebHookControllerRest {
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String connectWebHook(@RequestParam("hub.challenge") String challenge) {
        return challenge;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void receberBodyMessenger(@RequestBody BodyEntrada body) {
        SenderIdEMensagem idEMensagem = new SenderIdEMensagem(body);
        PayloadResposta payloadResposta = new PayloadResposta();
        payloadResposta.enviarMensagem(idEMensagem);
    }
}