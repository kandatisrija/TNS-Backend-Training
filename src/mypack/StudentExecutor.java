package mypack;

public class StudentExecutor {

	public static void main(String[] args) {
		Student s = new Student();
        s.rollno = 657;
        s.sname = "Srija";
        s.branch = "AI & ML";

        Student s1 = new Student();
        s1.rollno = 2;
        s1.sname = "Ravi";
        s1.branch = "CSE";
        s.print();
        s1.print();
       
	}

}