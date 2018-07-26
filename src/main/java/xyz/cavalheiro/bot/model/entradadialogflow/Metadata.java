package xyz.cavalheiro.bot.model.entradadialogflow;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Metadata{
    private String intentId;
    private String webhookUsed;
    private String webhookForSlotFillingUsed;
    private boolean endConversation;
    private String isFallbackIntent;
    private String intentName;

    public String getIntentId(){
        return intentId;
    }
    public void setIntentId(String input){
        this.intentId = input;
    }
    public String getWebhookUsed(){
        return webhookUsed;
    }
    public void setWebhookUsed(String input){
        this.webhookUsed = input;
    }
    public String getWebhookForSlotFillingUsed(){
        return webhookForSlotFillingUsed;
    }
    public void setWebhookForSlotFillingUsed(String input){
        this.webhookForSlotFillingUsed = input;
    }
    public boolean getEndConversation(){
        return endConversation;
    }
    public void setEndConversation(boolean input){
        this.endConversation = input;
    }
    public String getIsFallbackIntent(){
        return isFallbackIntent;
    }
    public void setIsFallbackIntent(String input){
        this.isFallbackIntent = input;
    }
    public String getIntentName(){
        return intentName;
    }
    public void setIntentName(String input){
        this.intentName = input;
    }
}
