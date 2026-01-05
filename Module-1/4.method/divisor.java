class divisor{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=10;i++){
			if(n/i==0){
				System.out.println(i);
			}
		}
	}
}