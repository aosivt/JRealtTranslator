package kww.RealtTranslator.Core.Server;

public class AuthentificationFailException extends Exception{
    public AuthentificationFailException(String message){
        super(message);
    }

    public AuthentificationFailException(String message, Exception innerException){
        super(message,innerException);
    }
}
