package fr.aston.banque;

// pour creer un nouveau type d'exception il faut heriter de la classe Exception ou RuntimeException
public class BanqueException extends RuntimeException{
    public BanqueException(){

    }

    public BanqueException(String message) {
        super(message);
    }

    public BanqueException(String message, Throwable cause) {
        super(message, cause);
    }

    public BanqueException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
