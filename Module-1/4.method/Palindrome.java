import java.util.*;
class Palindrome {
	public static void palindrome() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem=0;
		int rev=0;
		for (int t=n;t !=0;t /=10){
			rem=t%10;
			rev=((rev*10)+rem);
		}
		if(rev==n);
		{
			System.out.println(n+" it is a Palindrome");
		}
		else{
			System.out.println(n+" it is not a Palindrome");
		}
	}
}