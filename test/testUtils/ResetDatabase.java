package testUtils;

//import org.apache.cayenne.access.DataContext;
import org.apache.cayenne.remote.ClientChannel;
import org.apache.cayenne.remote.ClientConnection;
import org.apache.cayenne.remote.hessian.HessianConnection;
import org.apache.cayenne.CayenneContext;
import org.apache.cayenne.DataChannel;
import org.apache.cayenne.ObjectContext;

public class ResetDatabase {

	/**
	 * Simple method for resetting the database
	 * 
	 */
	public static void main(String[] args) {
			
		// extract the DataContext
		ClientConnection connection = new HessianConnection("http://localhost:8080/cayenne-service","ralph","letmein",null);
    	DataChannel channel = new ClientChannel(connection);
    	ObjectContext context = new CayenneContext(channel);
			
		// empty the database
		DatabaseManager.emptyDatabase(context);		
		
	}
	
}

