class Number{
	public static void isDeficient(int n) {
		if(n>0){

			int s=0;
			for (int i=1;i<n;i++){
				if(n % i ==0){
					s=s+i;
				}
			}
			if(s<n){
				System.out.println(n+" is deficient");
			}
			else if(s==n){
				System.out.println(n+" is perfecet");
			}
			else {
				System.out.println(n+" is abundant(s>n)");
			}
			
		}
		else{
			System.out.println("invalid number");
		}
		
	}
}