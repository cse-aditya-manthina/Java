class Sub extends Super {
	public String nsv="sub";
	public void nsm() {
		System.out.println("nsm of sub class ");
	}
	 public void detailsOfSub() {
	 	System.out.println(this.nsv);
	 	this.nsm();
	 	System.out.println();
	 }
	public void detailsOfSuper() {
		System.out.println(super.nsv);
		super.nsm();
		System.out.println();
	}

}