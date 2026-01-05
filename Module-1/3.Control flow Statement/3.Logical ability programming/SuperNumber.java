class SuperNumber{
	public static void main(String[] args) {
		int i=1234;
		int evensum=0;
		int oddsum=0;
		for(int t=i;t!=0;t=t/10){
			int r=t%10;
			if(r%2==0){
				evensum = evensum + r;
			}
			else{
				oddsum = oddsum + r;
			}
		}
		System.out.println(evensum);
		System.out.println(oddsum);
		if(evensum == oddsum){
			System.out.println(i+" is super number");
		}
		else{
			System.out.println(i+" is not a super number");
		}
	}
}