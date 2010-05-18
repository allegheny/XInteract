package testUtils;

import org.apache.cayenne.access.DataContext;

public class ResetDatabase2 {

	public static void main(String[] args) {
		
		DataContext context = DataContext.createDataContext();

		// empty the database
		DatabaseManager.emptyDatabase(context);
		
	}
	
}
