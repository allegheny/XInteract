package dynamic;

/**
 *
 * @author Radu Creanga <rdcrng@gmail.com>
 */
public class CompilationException extends Exception {

    public CompilationException() {
        super();
    }

    public CompilationException(String message) {
        super(message);
    }

    public CompilationException(String message, Throwable cause) {
        super(message, cause);
    }

    public CompilationException(Throwable cause) {
        super(cause);
    }
}
