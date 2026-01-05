class Employee{

    // Instance variables
    private int id, age, yearOfExperience;
    private long contact, aadharNo, uanNumber;
    private double salary;

    private String name, emailId, dob, gender, maritalStatus;
    private String branch, department, reportingManager;
    private String designation, role, incentive, panNo;
    private String city, state;

    // Static variables
    static String company;
    static String country;

    public Employee() {}

    // Parameterized constructor
    public Employee(int id, String name, String emailId, long contact, long aadharNo,
                    String panNo, String dob, int age, String gender, String maritalStatus,
                    String branch, String department, String reportingManager,
                    String designation, double salary, String role, String incentive,
                    long uanNumber, int yearOfExperience, String city, String state) {

        this.id = id;
        this.name = name;
        this.emailId = emailId;
        this.contact = contact;
        this.aadharNo = aadharNo;
        this.panNo = panNo;
        this.dob = dob;
        this.age = age;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.branch = branch;
        this.department = department;
        this.reportingManager = reportingManager;
        this.designation = designation;
        this.salary = salary;
        this.role = role;
        this.incentive = incentive;
        this.uanNumber = uanNumber;
        this.yearOfExperience = yearOfExperience;
        this.city = city;
        this.state = state;
    }

    // Getters & Setters
        public void setId(int id){ 
            this.id=id; }
        public void setName(String name){
            this.name=name; }
        public void setEmailId(String emailId){ 
            this.emailId=emailId; }
        public void setContact(long contact){ 
            this.contact=contact; }
        public void setAadharNo(long aadharNo){ 
            this.aadharNo=aadharNo; }
        public void setPanNo(String panNo){ 
            this.panNo=panNo; }
        public void setDob(String dob){ 
            this.dob=dob; }
        public void setAge(int age){ this.age=age; }
        public void setGender(String gender){ this.gender=gender; }
    public void setMaritalStatus(String maritalStatus){ this.maritalStatus=maritalStatus; }
    public void setBranch(String branch){ this.branch=branch; }
    public void setDepartment(String department){ this.department=department; }
    public void setReportingManager(String reportingManager){ this.reportingManager=reportingManager; }
    public void setDesignation(String designation){ this.designation=designation; }
    public void setSalary(double salary){ this.salary=salary; }
    public void setRole(String role){ this.role=role; }
    public void setIncentive(String incentive){ this.incentive=incentive; }
    public void setUanNumber(long uanNumber){ this.uanNumber=uanNumber; }
    public void setYoe(int yearOfExperience){ this.yearOfExperience=yearOfExperience; }
    public void setCity(String city){ this.city=city; }
    public void setState(String state){ this.state=state; }

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