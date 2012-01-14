package populate;

import org.apache.cayenne.access.DataContext;
import org.apache.cayenne.query.NamedQuery;
import java.util.Collections;
import java.util.Date;
import cayenne.DBobjects.*;

public class PopulateFall2009 {
	
	public static void main(String[] args) {
		
		DataContext	context = DataContext.createDataContext();
		
		// empty the database
		emptyDatabase(context);
		
		// populate the database
		populateDatabase(context);
		
	}
	
	public static void emptyDatabase(DataContext context) {
		
		//QueryChain chain = new QueryChain();
		context.performGenericQuery(new NamedQuery("DeleteAll", 
				Collections.singletonMap("table","ASSIGNMENT")));
		context.performGenericQuery(new NamedQuery("DeleteAll", 
				Collections.singletonMap("table","ATTEMPT")));
		context.performGenericQuery(new NamedQuery("DeleteAll", 
				Collections.singletonMap("table","ENROLLMENT")));
		context.performGenericQuery(new NamedQuery("DeleteAll", 
				Collections.singletonMap("table","CLASS")));
		context.performGenericQuery(new NamedQuery("DeleteAll", 
				Collections.singletonMap("table","PROBLEM")));
		context.performGenericQuery(new NamedQuery("DeleteAll", 
				Collections.singletonMap("table","CATEGORY")));
		context.performGenericQuery(new NamedQuery("DeleteAll", 
				Collections.singletonMap("table","STUDENT")));
		context.performGenericQuery(new NamedQuery("DeleteAll", 
				Collections.singletonMap("table","PROFESSOR")));
		//context.performGenericQuery(chain);
	}
	
	public static void populateDatabase(DataContext context) {
		
		Student[] students = new Student[60];
		Professor[] professors = new Professor[4];
		Problem[] problems = new Problem[60];
		cayenne.DBobjects.Class[] classes = new cayenne.DBobjects.Class[20];
		Category[] categories = new Category[20];
		//Attempt[] attempts = new Attempt[60];
		
		// add students
		students[0] = (Student)context.newObject(Student.class);
		students[0].setFirstName("Robert");
		students[0].setLastName("Roos");
		students[0].setUserName("rroos");
		students[0].setPassword("");
		
		students[1] = (Student)context.newObject(Student.class);
		students[1].setFirstName("Bob");
		students[1].setLastName("Cupper");
		students[1].setUserName("bcupper");
		students[1].setPassword("");

		students[2] = (Student)context.newObject(Student.class);
		students[2].setFirstName("Matthew");
		students[2].setLastName("Jadud");
		students[2].setUserName("mjadud");
		students[2].setPassword("");
		
		students[3] = (Student)context.newObject(Student.class);
		students[3].setFirstName("Gregory");
		students[3].setLastName("Kapfhammer");
		students[3].setUserName("gkapfham");
		students[3].setPassword("");
		
		students[4] = (Student)context.newObject(Student.class);
		students[4].setFirstName("Alexander");
		students[4].setLastName("Conrad");
		students[4].setUserName("conrada");
		students[4].setPassword("");

		students[5] = (Student)context.newObject(Student.class);
		students[5].setFirstName("Radu");
		students[5].setLastName("Creanga");
		students[5].setUserName("creangr");
		students[5].setPassword("");

		students[6] = (Student)context.newObject(Student.class);
		students[6].setFirstName("Erik");
		students[6].setLastName("Ostrofsky");
		students[6].setUserName("ostrofe");
		students[6].setPassword("");
		
		
		context.commitChanges();
		
		// add professors
		professors[0] = (Professor)context.newObject(Professor.class);
		professors[0].setFirstName("Robert");
		professors[0].setLastName("Roos");
		professors[0].setUserName("rroos");
		professors[0].setPassword("");
		
		professors[1] = (Professor)context.newObject(Professor.class);
		professors[1].setFirstName("Bob");
		professors[1].setLastName("Cupper");
		professors[1].setUserName("bcupper");
		professors[1].setPassword("");

		professors[2] = (Professor)context.newObject(Professor.class);
		professors[2].setFirstName("Matthew");
		professors[2].setLastName("Jadud");
		professors[2].setUserName("mjadud");
		professors[2].setPassword("");
		
		professors[3] = (Professor)context.newObject(Professor.class);
		professors[3].setFirstName("Gregory");
		professors[3].setLastName("Kapfhammer");
		professors[3].setUserName("gkapfham");
		professors[3].setPassword("");
		
		context.commitChanges();
		
		// add categories
		categories[0] = (Category)context.newObject(Category.class);
		categories[0].setName("Examination 1 Review Problems");
		categories[0].setDescription("These problems come from the \"First Examination Review Questions\" handout.");
		
		categories[1] = (Category)context.newObject(Category.class);
		categories[1].setName("Examination 2 Review Problems");
		categories[1].setDescription("These problems come from the \"Second Examination Review Questions\" handout.");
		
		context.commitChanges();
		
		// add classes
		classes[0] = (cayenne.DBobjects.Class)context.newObject(cayenne.DBobjects.Class.class);
		classes[0].setSemester("Fall");
		classes[0].setTitle("CMPSC*111");
		classes[0].setYearTaught(2009);
		classes[0].setProfessor(professors[1]);
		classes[0].addToStudents(students[0]);		
		classes[0].addToStudents(students[1]);
		classes[0].addToStudents(students[2]);
		classes[0].addToStudents(students[3]);
		classes[0].addToStudents(students[4]);
		classes[0].addToStudents(students[5]);
		classes[0].addToStudents(students[6]);
		
		classes[1] = (cayenne.DBobjects.Class)context.newObject(cayenne.DBobjects.Class.class);
		classes[1].setSemester("Fall");
		classes[1].setTitle("CMPSC*112");
		classes[1].setYearTaught(2009);
		classes[1].setProfessor(professors[2]);
		classes[0].addToStudents(students[0]);		
		classes[0].addToStudents(students[1]);
		classes[0].addToStudents(students[2]);
		classes[0].addToStudents(students[3]);
		classes[0].addToStudents(students[4]);
		classes[0].addToStudents(students[5]);
		classes[0].addToStudents(students[6]);
		
		classes[2] = (cayenne.DBobjects.Class)context.newObject(cayenne.DBobjects.Class.class);
		classes[2].setSemester("Fall");
		classes[2].setTitle("CMPSC*210");
		classes[2].setYearTaught(2009);
		classes[2].setProfessor(professors[1]);
		classes[0].addToStudents(students[0]);		
		classes[0].addToStudents(students[1]);
		classes[0].addToStudents(students[2]);
		classes[0].addToStudents(students[3]);
		classes[0].addToStudents(students[4]);
		classes[0].addToStudents(students[5]);
		classes[0].addToStudents(students[6]);

		classes[3] = (cayenne.DBobjects.Class)context.newObject(cayenne.DBobjects.Class.class);
		classes[3].setSemester("Fall");
		classes[3].setTitle("CMPSC*290");
		classes[3].setYearTaught(2009);
		classes[3].setProfessor(professors[3]);
		classes[0].addToStudents(students[0]);		
		classes[0].addToStudents(students[1]);
		classes[0].addToStudents(students[2]);
		classes[0].addToStudents(students[3]);
		classes[0].addToStudents(students[4]);
		classes[0].addToStudents(students[5]);
		classes[0].addToStudents(students[6]);
		
		classes[4] = (cayenne.DBobjects.Class)context.newObject(cayenne.DBobjects.Class.class);
		classes[4].setSemester("Fall");
		classes[4].setTitle("CMPSC*381");
		classes[4].setYearTaught(2009);
		classes[4].setProfessor(professors[0]);
		classes[0].addToStudents(students[0]);		
		classes[0].addToStudents(students[1]);
		classes[0].addToStudents(students[2]);
		classes[0].addToStudents(students[3]);
		classes[0].addToStudents(students[4]);
		classes[0].addToStudents(students[5]);
		classes[0].addToStudents(students[6]);
		
		/*
		classes[5] = (cayenne.DBobjects.Class)context.newObject(cayenne.DBobjects.Class.class);
		classes[5].setSemester("Spring");
		classes[5].setTitle("CMPSC*390");
		classes[5].setYearTaught(2009);
		classes[5].setProfessor(professors[0]);
		classes[5].addToStudents(students[0]);
		*/
		
		context.commitChanges();
		
		// add problems, put in categories and classes
		/*
		problems[0] = (Problem)context.newObject(Problem.class);
		problems[0].setName("Exam 1 Review, Problem 1");
		problems[0].setDescription("Write a program segment to set k equal to the absolute value of j without " +
									"\n using the absolute value function. Assume that k has already been " +
									"\n declared.");
		problems[0].setInputData("");
		problems[0].setOutputData("win");
		problems[0].setUpperCode("public class Test {" +
				"\n public static void main(String[] args) {" +
				"\n double k = 42;" +
				"\n double j = -24;" +
				"\n double[] input = {1, -1, 0, 12345.6789, -12345.6789};" +
				"\n double[] output = {1, 1, 0, 12345.6789, 12345.6789};" +
				"\n for (int curArg = 0; curArg < args.length; curArg++) {" +
				"\n j = input[curArg];");
		problems[0].setLowerCode("\n if (k!=output[curArg]) " +
				"\n System.out.println(\"Wrong!\");" +
				"\n }" +
				"\n System.out.println(\"win\");" +
				"\n }}");
		problems[0].setAuthor(professors[1]);
		problems[0].setCategory(categories[0]);
		problems[0].addToClasses(classes[0]);
		
		problems[1] = (Problem)context.newObject(Problem.class);
		problems[1].setName("Exam 1 Review, Problem 2");
		problems[1].setDescription("Write a class method named oddPos that has one parameter representing an integer." +
									"\n This method returns true if n is an odd positive integer (such as 1,3,5,7,...) and " +
									"\n returns false otherwise.");
		problems[1].setInputData("");
		problems[1].setOutputData("win");
		problems[1].setUpperCode("public class Test {" +
				"\n public static void main(String[] args) {" +
				"\n if(oddPos(-1))System.out.println(\"Wrong!\");" +
				"\n if(oddPos(0))System.out.println(\"Wrong!\");" +
				"\n if(oddPos(2))System.out.println(\"Wrong!\");" +
				"\n if(!oddPos(1))System.out.println(\"Wrong!\");" +
				"\n if(!oddPos(5187))System.out.println(\"Wrong!\");" +
				"\n System.out.println(\"win\");" +
				"\n }");
		problems[1].setLowerCode("\n }");
		problems[1].setAuthor(professors[1]);
		problems[1].setCategory(categories[0]);
		problems[1].addToClasses(classes[0]);
		
		problems[2] = (Problem)context.newObject(Problem.class);
		problems[2].setName("Exam 2 Review pt. 1, Problem 1a");
		problems[2].setDescription("Assume that we have an instance integer array called myInts with 10 " +
									"\n elements. Write a public instance method called summation to compute and " +
									"\n return the sum of the elements in the array.");
		problems[2].setInputData("");
		problems[2].setOutputData("win");
		problems[2].setUpperCode("public class Test {" +
				"\n public int[] myInts;" +
				"\n public Test() {" +
				"\n myInts = new int[10];" +
				"\n }" +
				"\n public static void main(String[] args) {" +
				"\n Test test = new Test();" +
				"\n int sum = 0;" +
				"\n test.myInts = {0,0,0,0,0,0,0,0,0,0};" +
				"\n if (summation != sum) System.out.println(\"Wrong!\");" +
				"\n sum = 0; test.myInts = {5, 10, 14, 2, 3, 0, -12, -18, -4}; if (test.summation != sum) System.out.println(\"Wrong!\");" +
				"\n sum = 0; test.myInts = {0,0,0,0,0,0,0,0,0,0}; if (test.summation != sum) System.out.println(\"Wrong!\");" +
				"\n sum = -59; test.myInts = {-11, -12, -13, -1, -2, -3, -4, -5, -6, -2}; if (test.summation != sum) System.out.println(\"Wrong!\");" +
				"\n sum = 43; test.myInts = {10,2,5,4,3,6,7,3,1,2}; if (test.summation != sum) System.out.println(\"Wrong!\");" +
				"\n System.out.println(\"win\");" +
				"\n }");
		problems[2].setLowerCode("\n }");
		problems[2].setAuthor(professors[1]);
		problems[2].setCategory(categories[1]);
		problems[2].addToClasses(classes[0]);
		
		problems[3] = (Problem)context.newObject(Problem.class);
		problems[3].setName("Exam 1 Review, Problem 3");
		problems[3].setDescription("Write a program segment that will set k equal to true if the value of b " +
									"\n is between (inclusive) the values of 1 and c or if the value of y " +
									"\n is between (exclusive) the values of x and z. Set k equal to false" +
									"\n otherwise.");
		problems[3].setInputData("");
		problems[3].setOutputData("win");
		problems[3].setUpperCode("public class Test {" +
				"\n public static int c, x, z, b, y;" +
				"\n public static boolean k = false;" + 
				"\n public static void main(String[] args) {" +
				"\n b=1; c=2; y=3; x=3; z=4; check(); if(!k) System.out.println(\"Wrong!\");" +
				"\n b=0; c=-1; y=3; x=3; z=4; check(); if(!k) System.out.println(\"Wrong!\");" +
				"\n b=0; c=2; y=3; x=2; z=4; check(); if(!k) System.out.println(\"Wrong!\");" +
				"\n b=0; c=2; y=3; x=3; z=4; check(); if(k) System.out.println(\"Wrong!\");" +
				"\n b=0; c=2; y=3; x=4; z=2; check(); if(!k) System.out.println(\"Wrong!\");" +
				"\n System.out.println(\"win\");" +
				"\n }" +
				"\n public static void check() {" +
				"\n");
		problems[3].setLowerCode("\n }}");
		problems[3].setAuthor(professors[1]);
		problems[3].setCategory(categories[0]);
		problems[3].addToClasses(classes[0]);
		
		
		context.commitChanges();
		*/
		
		// add attempts
		/*
		attempts[0] = (Attempt)context.newObject(Attempt.class);
		attempts[0].setCause("what is this field?");
		attempts[0].setDate(new Date(2000000000));
		attempts[0].setStudentCode("System.out.println(\"hello world\");");
		attempts[0].setSuccessfull(true);
		attempts[0].setProblem(problems[0]);
		attempts[0].setStudent(students[0]);
		
		
		
		context.commitChanges();
		*/
		
	}
	
}
