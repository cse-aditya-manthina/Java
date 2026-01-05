class JavaApplication{
	public static void execution(){
		Super s=new Super();
		System.out.println(s.nsv);
		s.sm();

		Sub su=new Sub();
		System.out.println(su.nsv);
		su.nsm();

	}
}