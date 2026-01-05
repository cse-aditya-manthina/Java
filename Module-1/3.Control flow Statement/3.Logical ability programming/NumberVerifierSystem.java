class NumberVerifierSystem {
	public static void main(String[] args) {
		int n=0;
		if((n<0) && (n%2==0)){
			System.out.println(n+" is negative and even");
		}
		if((n<0) && (n%2!=0)){
			System.out.println(n+" is negative and odd");
		}
		if((n==0) && (n%2==0) && (n%2!=0)){
			System.out.println(n+" is neutral");
		}
		if((n>0) && (n%2==0)){
			System.out.println(n+" is positive and even");
		}
		if((n>0) && (n%2!=0)){
			System.out.println(n+" is positive and odd");
		}  
	}
}