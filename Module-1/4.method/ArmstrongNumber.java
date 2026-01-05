import java.util.*;
class ArmstrongNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int t=a;
		int sum=0;
		int count =0;
		while(t>0){
			int digit=t%10;
			
			count++;
			t=t/10;
		}
		t=a;
		while(t>0){
			int digit=t%10;
			sum=sum+ (int)(Math.pow(digit,count));
			t=t/10;

		}
		if(sum==a){
			System.out.println("it is an ArmstrongNumber");
		}
		else{
			System.out.println("not an ArmstrongNumber");
		}
	}
}