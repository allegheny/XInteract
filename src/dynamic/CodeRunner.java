package dynamic;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 *
 * @author radu
 */
public class CodeRunner {

    public static final String PLACEHOLDER = "<student code>";
    private Class testClass;
    private ByteArrayInputStream in;
    private ByteArrayOutputStream out,  err;

    public CodeRunner() {
        out = new ByteArrayOutputStream();
        err = new ByteArrayOutputStream();
    }

    public boolean compile(String code, String studentCode)
            throws CompilationException, LoadClassTaskException {
        testClass = XIntJavacBridge.call("Test", code.replace(PLACEHOLDER, studentCode));
        return true;
    }

    public boolean run(String input) throws ClassFormatException, RuntimeException {
        in = new ByteArrayInputStream(input.getBytes());
        // get main()
        Class[] mainParamListTypes = {(new String[0]).getClass()};
        Method main = null;
        try {
            main = testClass.getMethod("main", mainParamListTypes);
        } catch (NoSuchMethodException ex) {
            throw new ClassFormatException(ex);
        }
        // set up invocation arguments
        Object argsList[] = {input.split("\\s")};
        Object mainResult;
        // set up streams
        InputStream stdIn = System.in;
        PrintStream stdOut = System.out;
        PrintStream stdErr = System.err;
        System.setIn(in);
        System.setOut(new PrintStream(out));
        System.setErr(new PrintStream(err));
        // invoke main
        try {
            mainResult = main.invoke(null, argsList);
        } catch (IllegalAccessException ex) {
            throw new ClassFormatException(ex);
        } catch (InvocationTargetException ex) {
            throw new ClassFormatException(ex);
        } finally {
            // restore standard streams
            System.setIn(stdIn);
            System.setOut(stdOut);
            System.setErr(stdErr);
        }
        if (mainResult != null) {
            throw new ClassFormatException("main() returned a value.");
        }
        if (err.toString().compareTo("") != 0) {
            throw new RuntimeException(err.toString());
        }
        return true;
    }

    public boolean testOutput(String output) {
        Scanner scan = new Scanner(out.toString());
        boolean passed = true;
        for (String token : output.split("\\s")) {
            if (scan.hasNext()) {
                passed &= (token.compareTo(scan.next()) == 0);
            } else {
                return false;
            }
        }
        return passed;
    }
}
