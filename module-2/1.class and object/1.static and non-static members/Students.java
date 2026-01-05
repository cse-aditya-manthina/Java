import java.util.*;
class Students{
	int id;
	String name;
	long contact;
	  Scanner sc = new Scanner(System.in);

    public void insert() {
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Contact: ");
        contact = sc.nextLong();

        System.out.println("Student Inserted");
    }

    public void read() {
        System.out.println("Student Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Contact: " + contact);
    }

    public void update() {
        sc.nextLine();
        System.out.print("Enter New Name: ");
        name = sc.nextLine();
        System.out.print("Enter New Contact: ");
        contact = sc.nextLong();
        System.out.println("Student Updated");
    }

    public void delete() {
        id = 0;
        name = null;
        contact =0 ;
        System.out.println("Student Deleted");
    }
}