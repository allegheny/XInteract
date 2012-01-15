package dynamic;

/**
 *
 * @author Radu Creanga <rdcrng@gmail.com>
 */
public class LoadClassTaskException extends Exception {

    public LoadClassTaskException() {
        super();
    }

    public LoadClassTaskException(String message) {
        super(message);
    }

    public LoadClassTaskException(String message, Throwable cause) {
        super(message, cause);
    }

    public LoadClassTaskException(Throwable cause) {
        super(cause);
    }
}
