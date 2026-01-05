class NumberDisplayerSystem {
	public static void series(int s,int e) {
		if(s<e){
			System.out.println("forward series");
			for(int i=s;i<= e;i++){
				System.out.println(i);
			}

		}
		else if(s>e){
			System.out.println("backward series");
			for(int i=s;i>= e;i--){
				System.out.println(i);
			}
		}
		else{
			System.out.println("invalid ");
		}
		
	}
}