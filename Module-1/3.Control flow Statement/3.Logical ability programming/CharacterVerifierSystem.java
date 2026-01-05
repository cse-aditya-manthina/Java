class CharacterVerifierSystem {
	public static void main(String[] args) {
		char a='a';
		if(a>='A' && a<='Z'){
			System.out.println("uppercase letter");
			if(a='A' || a='E' || a='I' || a='O' || a='U'){
				System.out.println("it is an vowel");
			}
			else{
				System.out.println("it is a consonant");
			}
		}
		else if(a>='a' && a<='z'){
			System.out.println("lowercase letter");
			if(a='a' || a='e' || a='i' || a='o' || a='u'){
				System.out.println("it is an vowel");
			}
			else{
				System.out.println("it is a consonant");
		}
		else if(a>='0' && a<='9'){
			System.out.println("integer");

		}
		else {
			System.out.println("Symbol");
		}
	}
}
