package gr.aueb.cf.libraryapp.core.exceptions;

public class AppServerException extends EntityGenericException {

    public AppServerException(String message, String code) {
        super(message, code);
    }
}
