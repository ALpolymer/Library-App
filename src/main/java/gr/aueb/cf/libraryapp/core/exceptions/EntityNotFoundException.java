package gr.aueb.cf.libraryapp.core.exceptions;

public class EntityNotFoundException extends EntityGenericException{
  public static final String DEFAULT_CODE  = "Not Found";

  public EntityNotFoundException(String message, String code) {
    super(code + DEFAULT_CODE , message);
  }
}
