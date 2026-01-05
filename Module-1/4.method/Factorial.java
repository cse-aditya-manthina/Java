import java.util.*;
class Factorial{
	public static void check() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Number: ");
		int n=sc.nextInt();
		int p=1;
		for (int i=1;i<=n;i++){
			p=p*i;
		}
		System.out.println(p);
	}
}