package su.kww.realttranslator.core.exceptions;

import su.kww.realttranslator.core.api.inside.database.entities.Advert;

public class TranslatorException extends Exception {

    private Advert advert;
    private String userMessage;
    private String response;
    private Boolean rethrow;
    private Integer iteration;
    private ExceptionLevel level = ExceptionLevel.ERROR;


    public TranslatorException(Boolean rethrow, String message) {
        super(message);
        rethrow = rethrow;
        userMessage = "Технические проблемы на сайте";
    }

    public TranslatorException(Boolean rethrow, String message, String userMessage) {
        super(message);
        this.rethrow = rethrow;
        this.userMessage = userMessage;
    }

    public TranslatorException(Boolean rethrow, String message, String userMessage, String response) {
        super(message);
        this.rethrow = rethrow;
        this.userMessage = userMessage;
        this.response = response;
    }

    public TranslatorException(Boolean rethrow, String message, String userMessage, String response, Exception innerException) {
        super(message, innerException);
        this.rethrow = rethrow;
        this.userMessage = userMessage;
        this.response = response;
    }

    public TranslatorException(Boolean rethrow, String message, Exception innerException) {
        super(message, innerException);
        this.rethrow = rethrow;
        this.userMessage = "Технические проблемы на сайте";
    }

    public TranslatorException(Boolean rethrow, String message, String userMessage, Exception innerException) {
        super(message, innerException);
        this.rethrow = rethrow;
        this.userMessage = userMessage;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public String getResponse() {
        return response;
    }

    public Boolean getRethrow() {
        return rethrow;
    }

    public Integer getIteration() {
        return iteration;
    }

    public ExceptionLevel getLevel() {
        return level;
    }
}
