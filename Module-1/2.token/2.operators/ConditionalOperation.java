class ConditionalOperation {
	public static void main(String[] args){
		int i=10;
		int j=5;
		boolean c=i>j;
		System.out.println("value of i is : "+i);
		System.out.println("value of j is : "+j);
		System.out.println("value of c is : "+c);

		int r = c ? (i+j) : (i-j);
		System.out.println("value of r is : "+r );
		System.out.println(c ? 'j' : "java" ); 

	}
}