package mypack;

// Main class to execute the Employee program
public class EmployeeExecutor {

    public static void main(String[] args) {

        // Create first employee object
        Employee e1 = new Employee();
        e1.empId = 101;
        e1.empName = "Ravi";
        e1.department = "CSE";

        // Create second employee object
        Employee e2 = new Employee();
        e2.empId = 102;
        e2.empName = "Srija";
        e2.department = "AI & ML";

        // Print employee details
        e1.printDetails();
        e2.printDetails();
    }
}