class IncrementOperation {
	public static void main(String[] args) {
		int i = 10;
		int j=20;
		System.out.println("value of i is : "+i);
		System.out.println("value of j is : "+j);
		int inc = ++i - j++ + i++ - ++j;
		System.out.println("value if inc : "+inc);

		System.out.println("value of i after increment operation : "+i);
		System.out.println("value of j after increment operation : "+j);

	}
}