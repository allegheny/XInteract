package dynamic;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileManager;
import javax.tools.ToolProvider;

/**
 *
 * @author Radu Creanga <rdcrng@gmail.com>
 */
public class XIntJavacBridge {

    public static Class call(String name, String source)
            throws CompilationException, LoadClassTaskException {
        StringSJFO sourceFile[] = {new StringSJFO(name, source)};
        JavaCompiler javac = ToolProvider.getSystemJavaCompiler();
        JavaFileManager fileManager = javac.getStandardFileManager(null, null, null);
        ByteArrayOutputStream err = new ByteArrayOutputStream();
        PrintStream stdErr = System.err;
        System.setErr(new PrintStream(err));
        boolean successfull = javac.getTask(null, fileManager, null, null, null, Arrays.asList(sourceFile)).call();
        System.setErr(stdErr);
        if (successfull) {
            return (new XIntClassLoader()).findClassOnFileSystem(name);
        } else {
           throw new CompilationException(err.toString());
        }
    }
}
