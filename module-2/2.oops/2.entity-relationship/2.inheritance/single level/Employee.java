class Employee{
	int id;
	String name;
	String mailId;
	long contactNumber;
	static String city;
	static String state;
	static String country;
	public static void entrry(){
		System.out.println("employee enter into the campus");
	}
	public static void login(){
		System.out.println("employee logged in");

	}
	public static void shortBreak(){
		System.out.println("employee went for break");
	}
	public static void meeting(){
		System.out.println("employee went for meeting");
	}
	public static void longBreak(){
		System.out.println("employee went for long break");
	}
	public static void logout(){
		System.out.println("employee logged out of office");
	}
	public static void exit(){
		System.out.println("employee exited");
	}
}