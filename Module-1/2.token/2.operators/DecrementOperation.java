class DecrementOperation {
	public static void main(String[] args) {
		int i=34;
		int j=75;
		System.out.println("value of i is : "+i);
		System.out.println("value of j is : "+j);
		int inc=i-- + --j + --i + j--;
		System.out.println("value of inc is : "+inc);
		System.out.println("value of i after decrement is : "+i);
		System.out.println("value of j after decrement is : "+j);
	}
}