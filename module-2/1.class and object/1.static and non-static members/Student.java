 class Student{
 	int id;
 	String name;
 	String mailid;
 	long contactNumber;
 	static String city;
 	static String state;
 	static String country;
 	public void displayStudentDetails(){
 		System.out.println("Student details : ");
 		System.out.println("--------------------");
 		System.out.println("id : "+id);
 		System.out.println("name : "+name);
 		System.out.println("mailId : "+mailid);
 		System.out.println("contactNumber : "+contactNumber);
 		System.out.println("city : "+city);
 		System.out.println("state : "+state);
 		System.out.println("country : "+country);
 		System.out.println("");
 		
 	}
 } 