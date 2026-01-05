class Disarium {
	public static void main(String[] args) {
		int n = 135;
		int sum = 0;
		int count = 0;
		int temp = n;   

		// count digits
		while (temp > 0) {
			count++;
			temp /= 10;
		}

		temp = n;     
		while (temp > 0) {
			int digit = temp % 10;
			sum = sum + (int) Math.pow(digit, count);
			count--; 
			temp /= 10;
		}

		if (sum == n) {
			System.out.println("is a Disarium");
		} else {
			System.out.println("not a Disarium");
		}
	}
}
