class JavaApplication{
	public static void execution(){
		Student s=new Student();
		// //indirect read operation - safe
		// System.out.println(s.getId());
		// System.out.println(s.getName());

		// //indirect write operartion = safe
		// s.setId(1);
		// s.setName("kaja");

		// //indirect read operation - safe
		// System.out.println(s.getId());
		// System.out.println(s.getName());


		Scanner sc = new Scanner(System.in);
        int count = 1;

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        Employee.country = "India";
        Employee.company = "Capgemini";

        while (n != 0) {

            Employee emp = new Employee();

            System.out.print("Employee ID: ");
            emp.setid = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            emp.setname = sc.nextLine();

            System.out.print("Email: ");
            emp.setemailId = sc.nextLine();

            System.out.print("Contact: ");
            emp.setcontact = sc.nextLong();
            sc.nextLine();

            System.out.print("Aadhar No: ");
            emp.setaadharNo = sc.nextLong();
            sc.nextLine();

            System.out.print("PAN No: ");
            emp.setpanNo = sc.nextLine();

            System.out.print("DOB: ");
            emp.setdob = sc.nextLine();

            System.out.print("Age: ");
            emp.setage = sc.nextInt();
            sc.nextLine();

            System.out.print("Gender: ");
            emp.setgender = sc.nextLine();

            System.out.print("Marital Status: ");
            emp.setmaritalStatus = sc.nextLine();

            System.out.print("Branch: ");
            emp.setbranch = sc.nextLine();

            System.out.print("Department: ");
            emp.setdepartment = sc.nextLine();

            System.out.print("Reporting Manager: ");
            emp.setreportingManager = sc.nextLine();

            System.out.print("Designation: ");
            emp.setdesignation = sc.nextLine();

            System.out.print("Salary: ");
            emp.setsalary = sc.nextDouble();
            sc.nextLine();

            System.out.print("Role: ");
            emp.setrole = sc.nextLine();

            System.out.print("Incentive: ");
            emp.setincentive = sc.nextLine();

            System.out.print("UAN Number: ");
            emp.setuanNumber = sc.nextLong();
            sc.nextLine();

            System.out.print("Experience: ");
            emp.setyearOfExperience = sc.nextInt();
            sc.nextLine();

            System.out.print("City: ");
            emp.setcity = sc.nextLine();

            System.out.print("State: ");
            emp.setstate = sc.nextLine();

            System.out.println("\nEmployee " + count + " details ended\n");
 			Employee emp = new Employee(
                id, name, emailId, contact, aadharNo, panNo, dob, age,
                gender, maritalStatus, branch, department, reportingManager,
                designation, salary, role, incentive, uanNumber,
                yearOfExperience, city, state
            );
            emp.displayEmployeeDetails();
            emp.entry();
            emp.login();
            emp.shortBreak();
            emp.task();
            emp.update();
            emp.meeting();
            emp.reverseKT();
            emp.longBreak();
            emp.logout();
            emp.exit();

            count++;
            n--;
        }

	}
}