package xyz.cavalheiro.bot.model.entradadialogflow;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BodyDialogFlow{
    private Result result;

    public Result getResult(){
        return result;
    }
    public void setResult(Result input){
        this.result = input;
    }
}