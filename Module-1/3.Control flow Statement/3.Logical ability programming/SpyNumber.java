class SpyNumber {
	public static void main(String[] args) {
		int i=321;
		int sum=0;
		int product=1;
		for(int t=i; t !=0; t=t/10){
			int r=t%10;
			sum=sum + r;
			product = product * r;
		}
			System.out.println(sum);
			System.out.println(product);
			if(sum == product){
				System.out.println(i+" is spy number");
			}
			else{
				System.out.println(i+" is not a spy number");
			}

	}
}