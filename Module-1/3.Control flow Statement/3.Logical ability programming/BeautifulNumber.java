class BeautifulNumber {
	public static void main(String[] args) {
		
	int i=333;
	int evencount=0;
	int oddcount=0;
	for(int t=i;t!=0;t=t/10){
		int r=t%10;
		if(r%2==0){
			evencount++;
		}
		else{
			oddcount++;
		}

	}
	System.out.println(evencount);
	System.out.println(oddcount);
	if(evencount == oddcount){
		System.out.println(i+" is a BeautifulNumber");
	}
	else{
		System.out.println(i+" is not a BeautifulNumber");
	}
}
}