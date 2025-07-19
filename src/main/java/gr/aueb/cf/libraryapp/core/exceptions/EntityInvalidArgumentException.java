package gr.aueb.cf.libraryapp.core.exceptions;

public class EntityInvalidArgumentException extends EntityGenericException {
    private static final String DEFAULT_CODE = "Invalid Argument";

    public EntityInvalidArgumentException(String message, String code) {
        super(code + DEFAULT_CODE, message);
    }
}
