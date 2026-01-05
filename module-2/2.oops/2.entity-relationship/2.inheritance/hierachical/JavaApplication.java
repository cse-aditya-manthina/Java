class JavaApplication{
	public static void execution(){
		Oracle oracle = new Oracle();
		oracle.url = "www.oracledb.com";
		oracle.username = "raja";
		oracle.password = "raja@143";
		oracle.displayOracleDBInfo();
		oracle.connection();
		oracle.crudOperation();
		oracle.disconnection();

		MySQL mysql=new MySQL();
		mysql.url="ww.mysql.com";
		mysql.username="rani";
		mysql.password="rani@1234";
		mysql.dispalyMySQLInfo();
		mysql.connection();
		mysql.crudOperation();
		mysql.disconnection();
		
	}
}