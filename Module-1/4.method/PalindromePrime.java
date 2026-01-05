class PalindromePrime{
	public static void (String[] args) {
		
	int n=11;
	boolean isprime=true;
	boolean ispal=true;
	int count=0;
	int rem=0;
	int rev=0;
	while(n>0){
		for(int i=1;i<=n;i++){
			if(n%i==0){
				count++
			}

			}
			if(count==2){
				isprime=true;
			}
			else{
				isprime=false;
			}
		for(int t=n;t!=0;t/=10){
			rem=t%10;
			rev=((rev*10)+rem)
		}
		if(rev==n){
			ispal=true;
		}
		else{
			ispal=false;
		}
	}
	if(isprime && ispal){
		System.out.println("PalindromePrime");
	}
	else if(isprime && !ispal ){
		System.out.println("PalindromeComposite");
	}
	else{
		System.out.println("not PalindromePrime");
	}
}
}