import java.util.*;
class SpecialNumber {
	public static void main(String[] args) {
		int digitsum=0;
		int digitproduct=1;
		Scanner scanner=new Scanner(System.in);
		int a=sc.nextInt();
		int n=a;
		while(a>0){
			int digit=n%10;
			digitsum+=digit;
			digitproduct*=digit;
			n/=10;
		}
		if(digitsum+digitproduct==n){
			System.out.println("it is a SpecialNumber");
		}
		else{
			System.out.println("not a special number");
		}
	}
}