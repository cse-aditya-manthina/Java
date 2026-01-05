class Ramanujan{
	public static void main(String[] args) {
		int n=1729;
		int a=n;

		int sum=0;
		for(int i=a;i!=0;i/=10){
			int r=i%10;
			sum +=r;
		}
		int rev=0;
		int sum2=sum;
		for (int t=sum2;t !=0;t /=10){
			int rem=t%10;
			rev=((rev*10)+rem);

		}
		if((rev *sum2)==a){
			System.out.println("it is a Ramanujan number");
		}
		else{
			System.out.println("not a Ramanujan number");
		}

	}
}