class AutoBiographicalNumber {
	public static void main(String[] args) {
		int i=2020;
		int count =0;
		int sum=0;
		for(int t=i;t!=0;t=t/10){
			int r=t%10;
			sum = sum + r;
			count++;
		}
		System.out.println(sum);
		System.out.println(count);
		if(sum == count ){
			System.out.println(i+" is a AutoBiographicalNumber");
		}
		else{
			System.out.println(i+" is not a AutoBiographicalNumber");
		}
	}
}