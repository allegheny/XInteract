package testUtils;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import junit.framework.AssertionFailedError;

public class PrivateMethodAccessor {
	
	/**
	 * See documentation for invokeMethod
	 * 
	 */
	public static Object invokeStaticMethod(Class targetClass,
            String methodName, Class[] argClasses, Object[] argObjects)
            throws InvocationTargetException {
		
		return invokeMethod(targetClass, methodName, argClasses, argObjects,
				null);
		
	}
	
	/**
	 * This method was adapted from Bill Venner's method as available at
	 * http://www.artima.com/suiterunner/private3.html
	 * 
	 * @param targetClass class to which the method to be called belongs
	 * @param methodName name of the method to be called
	 * @param argClasses formal parameter types of the method 
	 * @param argObjects arguments for the method
	 * @param targetObject object upon which the method is to be called
	 * @throws InvocationTargetException
	 */
    public static Object invokeMethod(Class targetClass,
            String methodName, Class[] argClasses, Object[] argObjects,
            Object targetObject)
            throws InvocationTargetException {

    	Object result = null;
    	
        try {
            Method method = targetClass.getDeclaredMethod(methodName,
                    argClasses);
            method.setAccessible(true);
            result = method.invoke(targetObject, argObjects);
        }
        catch (NoSuchMethodException e) {
            // Should happen only rarely, because most times the
            // specified method should exist. If it does happen, just let
            // the test fail so the programmer can fix the problem.
            throw new AssertionFailedError("NoSuchMethodException");
        }
        catch (SecurityException e) {
            // Should happen only rarely, because the setAccessible(true)
            // should be allowed in when running unit tests. If it does
            // happen, just let the test fail so the programmer can fix
            // the problem.
            throw new AssertionFailedError("SecurityException");
        }
        catch (IllegalAccessException e) {
            // Should never happen, because setting accessible flag to
            // true. If setting accessible fails, should throw a security
            // exception at that point and never get to the invoke. But
            // just in case, wrap it in a TestFailedException and let a
            // human figure it out.
            throw new AssertionFailedError("IllegalAccessException");
        }
        catch (IllegalArgumentException e) {
            // Should happen only rarely, because usually the right
            // number and types of arguments will be passed. If it does
            // happen, just let the test fail so the programmer can fix
            // the problem.
            throw new AssertionFailedError("IllegalArgumentException");
        }
        
        return result;
        
    }

    /**
	 * Gets the field value from an instance.  The field we wish to retrieve is
	 * specified by passing the name.  The value will be returned, even if the
	 * field would have private or protected access.
	 * 
	 * Adapted from Arne Vandamme's code as posted at: 
	 * http://www.jroller.com/CoBraLorD/entry/junit_testing_private_fields_and
	 * 
	 * @param instance object to pull the field from
	 * @param name name of the field that you want
	 */
	public static Object getField(Object instance, String name) 
	throws NoSuchFieldException {
		
		try {
			
			Class c = instance.getClass();
			
			// Retrieve the field with the specified name
			Field f = c.getDeclaredField(name);
			
			// *MAGIC* make sure the field is accessible, even if it
			// would be private or protected
			f.setAccessible(true);
			
			// Return the value of the field for the instance
			return f.get(instance);
			
		}
		catch (IllegalAccessException e) {
			// should never happen, since we are manually setting
			// the field to be accessable, but ust in case, lets
			// simplify things down to NoSuchField with a message
			// and let the programmer figure it out
			throw new NoSuchFieldException("IllegalAccessException"); 
		}
		
	}
    
	
}
