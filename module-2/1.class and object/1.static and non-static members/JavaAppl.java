import java.util.*;
class JavaAppl{
	public static void exe() {
		// System.out.println(Members.sv);
		// Members.sm();

		// Members members=new Members();
		// System.out.println(members.nsv);
		// members.nsm();

		Scanner sc=new Scanner(System.in);
		Students student=new Students();
		int choice;

		do {
			System.out.println("slelct your choice: ");
			System.out.println("---------------------");
            System.out.println("1.Insert");
            System.out.println("2.Read");
            System.out.println("3.Update");
            System.out.println("4.Delete");
            System.out.println("5.Exit");
            System.out.print("Enter choice: ");
        	choice = sc.nextInt();

            switch (choice) {

                case 1:
                	System.out.println(student);
                    student.insert();
                    break;
                case 2:
                    student.read();
                    break;
                case 3:
                    student.update();
                    break;
                case 4:
                    student.delete();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
		


	}
}