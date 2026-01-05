class Employee {

	// Instance variables
    int id, age, yearOfExperience;
    long contact, aadharNo, uanNumber;
    double salary;

    String name, emailId, dob, gender, maritalStatus;
    String branch, department, reportingManager;
    String designation, role, incentive, panNo;
    String city, state;

    // Static variables (common for all employees)
    static String company;
    static String country;

    public void displayEmployeeDetails() {
        System.out.println("Employee ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Email : " + emailId);
        System.out.println("Contact : " + contact);
        System.out.println("Aadhar No : " + aadharNo);
        System.out.println("PAN No : " + panNo);
        System.out.println("DOB : " + dob);
        System.out.println("Age : " + age);
        System.out.println("Gender : " + gender);
        System.out.println("Marital Status : " + maritalStatus);
        System.out.println("Company : " + company);
        System.out.println("Branch : " + branch);
        System.out.println("Department : " + department);
        System.out.println("Reporting Manager : " + reportingManager);
        System.out.println("Designation : " + designation);
        System.out.println("Salary : " + salary);
        System.out.println("Role : " + role);
        System.out.println("Incentive : " + incentive);
        System.out.println("UAN Number : " + uanNumber);
        System.out.println("Experience : " + yearOfExperience);
        System.out.println("City : " + city);
        System.out.println("State : " + state);
        System.out.println("Country : " + country);
    }

    public void entry() {
        System.out.println("Employee entered the office");
    }

    public void login() {
        System.out.println("Employee logged in");
    }

    public void shortBreak() {
        System.out.println("Employee on short break");
    }

    public void task() {
        System.out.println("Employee working on task");
    }

    public void update() {
        System.out.println("Employee updated task status");
    }

    public void meeting() {
        System.out.println("Employee attending meeting");
    }

    public void reverseKT() {
        System.out.println("Employee giving reverse KT");
    }

    public void longBreak() {
        System.out.println("Employee on long break");
    }

    public void logout() {
        System.out.println("Employee logged out");
    }

    public void exit() {
        System.out.println("Employee exited the office");
    }
}
