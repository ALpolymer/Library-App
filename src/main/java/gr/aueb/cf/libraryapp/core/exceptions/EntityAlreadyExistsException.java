package gr.aueb.cf.libraryapp.core.exceptions;

public class EntityAlreadyExistsException extends EntityGenericException {
    private static final String DEFAULT_CODE = "Already Exists";

    public EntityAlreadyExistsException(String message, String code) {
        super(code + DEFAULT_CODE, message);
    }
}
