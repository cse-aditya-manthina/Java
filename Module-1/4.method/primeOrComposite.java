import java.util.*;
class primeOrComposite {
	public static void checker() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++){
			if(i !=1 && i!=n){
		
			if(n%i==0){
				count++;
			}
			}
		}
		if(count==0){
			System.out.println(n+" is a prime number");
		}
		else{
			System.out.println(n+" is a composite number");
		}

	}
	
}