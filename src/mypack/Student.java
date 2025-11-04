package mypack;

//Demo for the types of the variables
//Instance,Local,Static
public class Student {
	
	//Instance variable
	int rollno;
	String sname;
	String branch;
	
	//static variable
	static String CollegeName = "AVN";
	
	//method
	void print() {
		//local variable
		String msg="AVNIET Students";
		System.out.println(msg);
		System.out.println("The Student Details are : "+ rollno + " " + sname + " " + branch + " " + CollegeName );
	}
}