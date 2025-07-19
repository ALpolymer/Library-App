package gr.aueb.cf.libraryapp.core.exceptions;

/**
 * Γενική κλάση exception που κληρονομεί το message της Exception κλάσης
 * και στον constructor προσθέτουμε και το code που θα συγκεκριμενοποιεί
 * το exception.
 * π.χ. code μπορεί να είναι "book", "category" κλπ
 * Όλα τα άλλα exceptions κληρονομούν το ΕntityGenericException
 * ,συνεπώς κληρονομούν το code και message.
 */
public class EntityGenericException extends Exception {
    private final String code;

    public EntityGenericException(String message, String code) {
        super(message);
        this.code = code;
    }
}
