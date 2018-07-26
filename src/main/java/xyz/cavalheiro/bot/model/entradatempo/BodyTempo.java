package xyz.cavalheiro.bot.model.entradatempo;

public class BodyTempo{
    private String by;
    private boolean validKey;
    private Results results;

    public String getBy(){
        return by;
    }
    public void setBy(String input){
        this.by = input;
    }
    public boolean getValidKey(){
        return validKey;
    }
    public void setValidKey(boolean input){
        this.validKey = input;
    }
    public Results getResults(){
        return results;
    }
    public void setResults(Results input){
        this.results = input;
    }
}
