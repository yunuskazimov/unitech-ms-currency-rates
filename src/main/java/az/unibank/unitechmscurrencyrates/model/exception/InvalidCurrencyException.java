package az.unibank.unitechmscurrencyrates.model.exception;

public class InvalidCurrencyException extends RuntimeException {
    public InvalidCurrencyException(String message) {
        super(message);
    }
}
