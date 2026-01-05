class IfElseIfTask {
	public static void main(String[] args) {
		char signal = 'y';
		if((signal == 'R') || (signal == 'r')){
			System.out.println("please stop!");
		}
		else if((signal == 'Y') || (signal == 'y')){
			System.out.println("please get set ready");

		}
		else if((signal == 'G') || (signal == 'g')){
			System.out.println("please go");
		}
		else{
			System.out.println("do what ever you want");
		}
	}
}