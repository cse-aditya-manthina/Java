import java.util.*;
class Calculator{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean choice=true;

		do{
		System.out.println(" 1.addition");
		System.out.println("2.subtraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		System.out.println("5.exit");
		System.out.println("6.invalid choice");

		System.out.println("select your choice: ");
		int i=scanner.nextInt();
		
		if(i==5){
			choice=false;
			System.out.println("bye");
			break;
		}
		System.out.println("select integer a: ");
		int a=scanner.nextInt();
		System.out.println("select integer b: ");
		int b=scanner.nextInt();

			switch(i){
			case 1:{

				System.out.println(Math.addExact(a,b));

			}
			break;
			case 2:{

				System.out.println(Math.subtractExact(a,b));

			}
			break;
			case 3:{
				System.out.println(Math.multiplyExact(a,b));

			}
			break;
			case 4:{
				if(b !=0){
				int d=a/b;
				int r=a/b;
				System.out.println(d);
				System.out.println(r);
				}
				else{
					System.out.println("not divisible by zero");
				}
			}
			break;
		default:{
			System.out.println("wrong choice");
				}
			}
		}
		while(choice);

	}
}