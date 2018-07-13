package xyz.cavalheiro.bot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import xyz.cavalheiro.bot.model.mapeamentoentrada.BodyEntrada;
import xyz.cavalheiro.bot.postparamessenger.PayloadResposta;
import xyz.cavalheiro.bot.model.mapeamentoentrada.SenderIdEMensagem;

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
    public void receberBodyMessenger(@RequestBody BodyEntrada body){
        SenderIdEMensagem capturaIdEMensagem = new SenderIdEMensagem(body);
        PayloadResposta payloadResposta = new PayloadResposta();
        payloadResposta.enviarMensagem(capturaIdEMensagem);
    }
}

