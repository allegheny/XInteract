package xidb.convert;

import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author radu
 */
public class BufferConverter extends Converter {

    @Override
    public String convertForward(Object arg0) {
        StringBuffer someBuffer = (StringBuffer) arg0;
        return someBuffer.toString();
    }

    @Override
    public Object convertReverse(Object arg0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
