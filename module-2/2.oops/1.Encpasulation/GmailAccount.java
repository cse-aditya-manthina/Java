class GmailAccount{
	private String firstName,lastName,mailId,password;
	private long contactNumber;
	public GmailAccount(String firstName,String lastName,String mailId,String password,long contactNumber){
		this.firstName=firstName;
		this.lastName=lastName;
		this.mailId=mailId;
		this.password=password;
		this.contactNumber=contactNumber;
	}
	public void setPassword(String password){
		this.password=password; 

	}

}