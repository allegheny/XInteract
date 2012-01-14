package testUtils;

import org.apache.cayenne.access.DataContext;
//import org.apache.cayenne.query.QueryChain;
import org.apache.cayenne.query.NamedQuery;
import java.util.Collections;
import java.util.Date;
//import org.apache.cayenne.ObjectContext;

import cayenne.DBobjects.*;

public class DatabaseManager {

	/*
	 * template for database population:
	 * 
	 
	   // add the professors
		Professor prof = (Professor) 
			context.newObject(Professor.class);
		prof.setFirstName("");
		prof.setLastName("");
		context.commitChanges();
		
		// add the classes, and add professors to classes
		caynenne.DBobjects.Class cla = (caynenne.DBobjects.Class) 
			context.newObject(caynenne.DBobjects.Class.class);
		cla.setTitle("");
		cla.setSemester("");
		cla.setYearTaught(0);
		cla.setProfessor();
		context.commitChanges();
		
		// add the problems, and add to classes
		Problem prob = (Problem)context.newObject(Problem.class);
    	prob.setTitle("");
    	prob.setCategory("");
    	prob.setAuthor("");
    	prob.setDescription("");
    	prob.setUpperCode("");
    	prob.setLowerCode("");
    	// addToManyTarget will probably be replaced with a wrapper later
    	prob.addToManyTarget("class",,true);
    	context.commitChanges();
		
		// add the students, and add to classes
    	Student stu = (Student) context.newObject(Student.class);
		stu.setFirstName("");
		stu.setLastName("");
		stu.setUserName("");
		stu.addToClasses();
		context.commitChanges();
		
	 */
	
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
	
	public static void populateDatabase1(DataContext context) {
		
		Student[] students = new Student[5];
		Professor[] professors = new Professor[3];
		Problem[] problems = new Problem[5];
		cayenne.DBobjects.Class[] classes = new cayenne.DBobjects.Class[4];
		Category[] categories = new Category[2];
		Attempt[] attempts = new Attempt[5];
		
		// add students, accounts
		students[0] = (Student) context.newObject(Student.class);
		students[0].setFirstName("cookie");
		students[0].setLastName("monster");
		students[0].setUserName("cookies nom nom");
		students[0].setPassword("chocolate chips");
		
		students[1] = (Student)context.newObject(Student.class);
		students[1].setFirstName("Mango");
		students[1].setLastName("Lassi");
		students[1].setUserName("lassim");
		students[1].setPassword("mango mango!");
		
		students[2] = (Student)context.newObject(Student.class);
		students[2].setFirstName("Alan");
		students[2].setLastName("Turing");
		students[2].setUserName("a t");
		students[2].setPassword("tmachine");
		
		students[3] = (Student)context.newObject(Student.class);
		students[3].setFirstName("Rufus");
		students[3].setLastName("Gobblygook");
		students[3].setUserName("gob_goo");
		students[3].setPassword(" play doh ");
		
		students[4] = (Student)context.newObject(Student.class);
		students[4].setFirstName("Steve");
		students[4].setLastName("Martin");
		students[4].setUserName("$t3\\/e");
		students[4].setPassword("rinzma");
		
		context.commitChanges();
		
		// add professors, accounts
		professors[0] = (Professor)context.newObject(Professor.class);
		professors[0].setFirstName("Inderpal");
		professors[0].setLastName("4ndrej");
		professors[0].setUserName("4ndre");
		professors[0].setPassword("rinzma");
		
		professors[1] = (Professor)context.newObject(Professor.class);
		professors[1].setFirstName("OMG");
		professors[1].setLastName("POTATOes");
		professors[1].setUserName("rofl");
		professors[1].setPassword("p0t0");
		
		professors[2] = (Professor)context.newObject(Professor.class);
		professors[2].setFirstName("nom nom nom");
		professors[2].setLastName("nom");
		professors[2].setUserName("mon");
		professors[2].setPassword("rinzma");
		
		context.commitChanges();
		
		// add categories
		categories[0] = (Category)context.newObject(Category.class);
		categories[0].setName("fast food");
		categories[0].setDescription("omg tacos tacos tacos tacos nom nom nom");
		
		categories[1] = (Category)context.newObject(Category.class);
		categories[1].setName("yum food");
		categories[1].setDescription("is organic, local, sustainably grown, free range, cruelty free, fairly traded, and is not fast food (but i want tacos)");
		
		context.commitChanges();
		
		// add classes
		classes[0] = (cayenne.DBobjects.Class)context.newObject(cayenne.DBobjects.Class.class);
		classes[0].setSemester("Spring");
		classes[0].setTitle("cs 21/7ths");
		classes[0].setYearTaught(2012);
		classes[0].setProfessor(professors[0]);
		classes[0].addToStudents(students[0]);
		classes[0].addToStudents(students[1]);
		
		classes[1] = (cayenne.DBobjects.Class)context.newObject(cayenne.DBobjects.Class.class);
		classes[1].setSemester("Fall");
		classes[1].setTitle("cs 5 and a half");
		classes[1].setYearTaught(2012);
		classes[1].setProfessor(professors[0]);
		classes[1].addToStudents(students[0]);
		classes[1].addToStudents(students[3]);
		
		classes[2] = (cayenne.DBobjects.Class)context.newObject(cayenne.DBobjects.Class.class);
		classes[2].setSemester("Spring");
		classes[2].setTitle("cs 0");
		classes[2].setYearTaught(2012);
		classes[2].setProfessor(professors[1]);
		classes[2].addToStudents(students[0]);
		classes[2].addToStudents(students[1]);
		classes[2].addToStudents(students[2]);
		
		classes[3] = (cayenne.DBobjects.Class)context.newObject(cayenne.DBobjects.Class.class);
		classes[3].setSemester("Fall");
		classes[3].setTitle("cs 1024");
		classes[3].setYearTaught(2011);
		classes[3].setProfessor(professors[1]);
		classes[3].addToStudents(students[0]);
		
		context.commitChanges();
		
		// add problems, put in categories and classes
		problems[0] = (Problem)context.newObject(Problem.class);
		problems[0].setDescription("moo00000000000000000000000000000ooooooooooooooooof");
		problems[0].setInputData("");
		problems[0].setLowerCode("}}");
		problems[0].setName("moof");
		problems[0].setOutputData("");
		problems[0].setUpperCode("public class Test {" +
				"public static void main(String[] args) {");
		problems[0].setAuthor(professors[0]);
		problems[0].setCategory(categories[0]);
		problems[0].addToClasses(classes[0]);
		problems[0].addToClasses(classes[1]);
		problems[0].addToClasses(classes[3]);
		
		problems[1] = (Problem)context.newObject(Problem.class);
		problems[1].setDescription("hello world");
		problems[1].setInputData("");
		problems[1].setLowerCode("}}");
		problems[1].setName("hello world");
		problems[1].setOutputData("hello world");
		problems[1].setUpperCode("public class Test {" +
				"public static void main(String[] args) {");
		problems[1].setAuthor(professors[1]);
		problems[1].setCategory(categories[1]);
		problems[1].addToClasses(classes[0]);
		problems[1].addToClasses(classes[2]);
		
		problems[2] = (Problem)context.newObject(Problem.class);
		problems[2].setDescription("write something that compiles!");
		problems[2].setInputData(null);
		problems[2].setLowerCode("");
		problems[2].setName("omg write it");
		problems[2].setOutputData(null);
		problems[2].setUpperCode("");
		problems[2].setAuthor(professors[2]);
		problems[2].setCategory(categories[1]);
		
		problems[3] = (Problem)context.newObject(Problem.class);
		problems[3].setDescription("write a void method called potatoes with no args");
		problems[3].setInputData("");
		problems[3].setLowerCode("}");
		problems[3].setName("potatoes");
		problems[3].setOutputData("ok!");
		problems[3].setUpperCode("public class Test {" +
				"public static void main(String[] args) {" +
				"Object obj = potatoes();" +
				"if(obj==null){System.out.println(\"ok!\");}}");
		problems[3].setAuthor(professors[1]);
		problems[3].setCategory(categories[1]);
		problems[3].addToClasses(classes[0]);
		problems[3].addToClasses(classes[3]);
		problems[3].addToClasses(classes[2]);
		
		problems[4] = (Problem)context.newObject(Problem.class);
		problems[4].setDescription("write an import, class header, declaration and initialization for an ArrayList named moo");
		problems[4].setInputData("");
		problems[4].setLowerCode("public static void main(String[] args){" +
				"if(moo.getClass == ArrayList.class){System.out.println(\"ok!\");}}}");
		problems[4].setName("ArrayList");
		problems[4].setOutputData("ok!");
		problems[4].setUpperCode("");
		problems[4].setAuthor(professors[2]);
		problems[4].setCategory(categories[1]);
		problems[4].addToClasses(classes[0]);
		problems[4].addToClasses(classes[1]);
		
		context.commitChanges();
		
		// add attempts
		attempts[0] = (Attempt)context.newObject(Attempt.class);
		attempts[0].setCause("what is this field?");
		attempts[0].setDate(new Date(2000000000));
		attempts[0].setStudentCode("System.out.println(\"hello world\");");
		attempts[0].setSuccessfull(true);
		attempts[0].setProblem(problems[1]);
		attempts[0].setStudent(students[0]);
		
		attempts[1] = (Attempt)context.newObject(Attempt.class);
		attempts[1].setCause("hellooooooo?");
		attempts[1].setDate(new Date(1000000000));
		attempts[1].setStudentCode("");
		attempts[1].setSuccessfull(true);
		attempts[1].setProblem(problems[0]);
		attempts[1].setStudent(students[1]);
		
		attempts[2] = (Attempt)context.newObject(Attempt.class);
		attempts[2].setCause("i have no idea?");
		attempts[2].setDate(new Date());
		attempts[2].setStudentCode("import java.util.ArrayList;" +
				"public class Test {" +
				"public static ArrayList moo = new ArrayList();");
		attempts[2].setSuccessfull(true);
		attempts[2].setProblem(problems[4]);
		attempts[2].setStudent(students[0]);
		
		attempts[3] = (Attempt)context.newObject(Attempt.class);
		attempts[3].setCause("blarg?");
		attempts[3].setDate(new Date(500000000));
		attempts[3].setStudentCode("public class Test {" +
				"public static void main(String[] args){" +
				"nom nom nom" +
				"}}");
		attempts[3].setSuccessfull(false);
		attempts[3].setProblem(problems[2]);
		attempts[3].setStudent(students[0]);
		
		attempts[4] = (Attempt)context.newObject(Attempt.class);
		attempts[4].setCause("woof?");
		attempts[4].setDate(new Date(1234567890));
		attempts[4].setStudentCode("<a href=http://gelations.googlecode.com>" +
				"yum" +
				"</a>");
		attempts[4].setSuccessfull(false);
		attempts[4].setProblem(problems[3]);
		attempts[4].setStudent(students[0]);
		
		context.commitChanges();
		
	}
	
	public static void populateDatabase2(DataContext context) {
		
		Student[] students = new Student[60];
		Professor[] professors = new Professor[4];
		Problem[] problems = new Problem[60];
		cayenne.DBobjects.Class[] classes = new cayenne.DBobjects.Class[20];
		Category[] categories = new Category[20];
		Attempt[] attempts = new Attempt[60];
		
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
		students[6].setFirstName("");
		students[6].setLastName("");
		students[6].setUserName("");
		students[6].setPassword("");

		students[7] = (Student)context.newObject(Student.class);
		students[7].setFirstName("Erik");
		students[7].setLastName("Ostrofsky");
		students[7].setUserName("ostrofe");
		students[7].setPassword("");
		
		
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
		categories[0].setDescription("These problems come from Part II of the \"First Examination Review Questions\" handout.");
		
		categories[1] = (Category)context.newObject(Category.class);
		categories[1].setName("Examination 2 Review Problems, first study guide");
		categories[1].setDescription("These problems come from Part II of the first \"Second Examination Study Questions\" handout.");
		
		context.commitChanges();
		
		// add classes
		classes[0] = (cayenne.DBobjects.Class)context.newObject(cayenne.DBobjects.Class.class);
		classes[0].setSemester("Spring");
		classes[0].setTitle("CMPSC*111");
		classes[0].setYearTaught(2009);
		classes[0].setProfessor(professors[1]);
		classes[0].addToStudents(students[1]);
		classes[0].addToStudents(students[2]);
		classes[0].addToStudents(students[3]);
		classes[0].addToStudents(students[4]);
		classes[0].addToStudents(students[5]);
		classes[0].addToStudents(students[6]);
		classes[0].addToStudents(students[7]);
		
		classes[1] = (cayenne.DBobjects.Class)context.newObject(cayenne.DBobjects.Class.class);
		classes[1].setSemester("Spring");
		classes[1].setTitle("CMPSC*112");
		classes[1].setYearTaught(2009);
		classes[1].setProfessor(professors[2]);
		classes[1].addToStudents(students[2]);
		
		classes[2] = (cayenne.DBobjects.Class)context.newObject(cayenne.DBobjects.Class.class);
		classes[2].setSemester("Spring");
		classes[2].setTitle("CMPSC*210");
		classes[2].setYearTaught(2009);
		classes[2].setProfessor(professors[1]);
		classes[2].addToStudents(students[1]);

		classes[3] = (cayenne.DBobjects.Class)context.newObject(cayenne.DBobjects.Class.class);
		classes[3].setSemester("Spring");
		classes[3].setTitle("CMPSC*290");
		classes[3].setYearTaught(2009);
		classes[3].setProfessor(professors[3]);
		classes[3].addToStudents(students[3]);
		
		classes[4] = (cayenne.DBobjects.Class)context.newObject(cayenne.DBobjects.Class.class);
		classes[4].setSemester("Spring");
		classes[4].setTitle("CMPSC*381");
		classes[4].setYearTaught(2009);
		classes[4].setProfessor(professors[0]);
		classes[4].addToStudents(students[0]);
		
		classes[5] = (cayenne.DBobjects.Class)context.newObject(cayenne.DBobjects.Class.class);
		classes[5].setSemester("Spring");
		classes[5].setTitle("CMPSC*390");
		classes[5].setYearTaught(2009);
		classes[5].setProfessor(professors[0]);
		classes[5].addToStudents(students[0]);
		
		context.commitChanges();
		
		// add problems, put in categories and classes
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
		
		/*
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
		*/
		
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
	
	public static void populateDatabase3(DataContext context) {
		
		
		
	}
	
	public static void populateDatabase4(DataContext context) {
		
		
		
	}
	
	public static void populateDatabase5(DataContext context) {
		
		
		
	}
	
}
