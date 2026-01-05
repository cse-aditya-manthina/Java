import java.util.*;
class NeonNumber {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int a=scanner.nextInt();
		int sq=a*a;
		int sum=0;
		while(sq>0){
			sum += sq % 10;
			sq /=  10;
		}
		if(sum==a){
			System.out.println("it is a neon Number");
		}
		else{
			System.out.println("not a neon number");
		}
	}
}