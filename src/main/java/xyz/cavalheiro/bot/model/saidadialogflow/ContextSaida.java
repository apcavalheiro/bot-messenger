package xyz.cavalheiro.bot.model.saidadialogflow;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ContextSaida {
    private String lang;
    private String query;
    private String sessionId;
    private String timezone;

    public ContextSaida(String query) {
        this.lang = "pt-br";
        this.query = query;
        this.sessionId = "12345";
        this.timezone = "South_America/Brasilia";
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
}
