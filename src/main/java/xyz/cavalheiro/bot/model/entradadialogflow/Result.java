package xyz.cavalheiro.bot.model.entradadialogflow;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result{
    private String source;
    private String resolvedQuery;
    private String action;
    private boolean actionIncomplete;
    private Parameters parameters;
    private List<Contexts> contexts;
    private Metadata metadata;

    public String getSource(){
        return source;
    }
    public void setSource(String input){
        this.source = input;
    }
    public String getResolvedQuery(){
        return resolvedQuery;
    }
    public void setResolvedQuery(String input){
        this.resolvedQuery = input;
    }
    public String getAction(){
        return action;
    }
    public void setAction(String input){
        this.action = input;
    }
    public boolean getActionIncomplete(){
        return actionIncomplete;
    }
    public void setActionIncomplete(boolean input){
        this.actionIncomplete = input;
    }
    public Parameters getParameters(){
        return parameters;
    }
    public void setParameters(Parameters input){
        this.parameters = input;
    }
    public List<Contexts> getContexts(){
        return contexts;
    }
    public void setContexts(List<Contexts> input){
        this.contexts = input;
    }
    public Metadata getMetadata(){
        return metadata;
    }
    public void setMetadata(Metadata input){
        this.metadata = input;
    }
}
