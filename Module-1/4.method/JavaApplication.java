import java.util.Scanner;
class JavaApplication{
	public static void execution() {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("enter the input s : ");
		 int s=scanner.nextInt();
		 System.out.println("enter the inout e : ");
		 int e=scanner.nextInt();
		 NumberDisplayerSystem.series(s,e);
	} 
}