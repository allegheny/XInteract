package dynamic;

import java.net.URI;
import javax.tools.SimpleJavaFileObject;

/**
 *
 * @author Radu Creanga <rdcrng@gmail.com>
 */
public class StringSJFO extends SimpleJavaFileObject {
           final String source;

           StringSJFO(String name, String source) {
               super(URI.create("string:///" + name + Kind.SOURCE.extension), Kind.SOURCE);
               this.source = source;
           }

           @Override
           public CharSequence getCharContent(boolean ignoreEncodingErrors) {
               return source;
           }
       }
