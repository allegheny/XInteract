package testUtils;

import org.apache.cayenne.access.DataContext;
//import org.apache.cayenne.remote.ClientChannel;
//import org.apache.cayenne.remote.ClientConnection;
//import org.apache.cayenne.remote.hessian.HessianConnection;
//import org.apache.cayenne.CayenneContext;
//import org.apache.cayenne.DataChannel;
//import org.apache.cayenne.ObjectContext;

public class PopulateDatabase1 {

	/**
	 * Simple method for populating the database with sample data
	 * 
	 */
	public static void main(String[] args) {
					
		// extract the ObjectContext
		//ClientConnection connection = new HessianConnection("http://localhost:8080/cayenne-service","ralph","letmein",null);
    	//DataChannel channel = new ClientChannel(connection);
    	//ObjectContext context = new CayenneContext(channel);
		DataContext	context = DataContext.createDataContext();
		
		// empty the database
		DatabaseManager.emptyDatabase(context);
		
		// populate the database
		DatabaseManager.populateDatabase1(context);
		
	}
	
}
