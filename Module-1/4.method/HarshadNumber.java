import java.util.*;
class HarshadNumber{
	public static void main(String[] args) {
		
	
	Scanner scanner= new Scanner(System.in);
		int a=scanner.nextInt();
		int digitsum=0;
		int n=a;
		while(a>0){
			int digit=n%10;
			digitsum+=digit;
			n/=10;
		}
		if(digitsum%a==0){
			System.out.println("it is a Harshad Number");
		}
		else{
			System.out.println("not a harshad number");
		}
	}
}