class SwitchCaseStatement {
	public static void main(String[] args) {
		System.out.println("start");
		int choice=3;
		switch(choice){
			 case 1: {
			 	System.out.println("s1");
			 }
			 break;
			 case 2: {
			 	System.out.println("s2");
			 }
			 break;
			 case 3: {
			 	System.out.println("s3");
			 }
			 break;
			default: {
				System.out.println("s4");
			}
		}
		System.out.println("end");
	}
}