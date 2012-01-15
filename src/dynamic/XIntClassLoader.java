package dynamic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.tools.JavaFileObject;

/**
 *
 * @author Radu Creanga <rdcrng@gmail.com>
 */
public class XIntClassLoader extends ClassLoader {

    public XIntClassLoader() {
        super(ClassLoader.getSystemClassLoader());
    }

    
    public Class findClassOnFileSystem(String name) throws LoadClassTaskException {
        byte data[] = loadClassData(name);
        return defineClass(name, data, 0, data.length);
    }

    private byte[] loadClassData(String name) throws LoadClassTaskException {
        FileInputStream fileReader = null;
        try {
            fileReader = new FileInputStream(
                    System.getProperty("user.dir") +
                    System.getProperty("file.separator") +
                    name + JavaFileObject.Kind.CLASS.extension);
        } catch (FileNotFoundException ex) {
            throw new LoadClassTaskException(ex);
        }
        byte data[] = null;
        try {
            data = new byte[fileReader.available()];
            fileReader.read(data);
            fileReader.close();
        } catch (IOException ex) {
            throw new LoadClassTaskException(ex);
        }
        File file = new File(
                    System.getProperty("user.dir") +
                    System.getProperty("file.separator") +
                    name + JavaFileObject.Kind.CLASS.extension);
        file.delete();
        return data;
    }
}
