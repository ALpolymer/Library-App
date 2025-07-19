package gr.aueb.cf.libraryapp.core.exceptions;

public class EntityNotAuthorizedException extends EntityGenericException {
    private static final String DEFAULT_CODE = "NotAuthorized";

    public EntityNotAuthorizedException(String message, String code) {
        super(code + DEFAULT_CODE, message);
    }
}
