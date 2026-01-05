class Engine{
	private double cc;
	private int hp;
	private int cylinderCount;
	public Engine(int hp,double cc,int cylinderCount){
		this.hp=hp;
		this.cc=cc;
		this.cylinderCount=cylinderCount;
	}
	public double getCC(){
		return cc;
	}
	public int getHp(){
		return hp;
	}
	public int getCylinderCount(){
		return cylinderCount;
	} 
	public void displayEngineInfo(){
		System.out.println("Engine details : ");
		System.out.println("---------------------");
		System.out.println("cc : "+getCC());
		System.out.println("hp : "+getHp());
		System.out.println("cylinderCount : "+getCylinderCount());
		System.out.println();
	}
}