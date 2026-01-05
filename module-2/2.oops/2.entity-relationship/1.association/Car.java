class Car{
	 private String brand;
	 private String colour;
	 private String make;
	 private double price;
	 // car HAS-A engine
	 private Engine engine;
	 public Car(String brand,String colour,String make,double price,Engine engine){
	 	this.brand=brand;
	 	this.colour=colour;
	 	this.make=make;
	 	this.price=price;
	 	this.engine=engine;
	 }
	 // car HAS - A mediaplayer
	 private MediaPlayer mediaPlayer;

	 public String getBrand(){
		return brand;
	}
	
	public String getMake(){
		return make;
	}
	
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public String getColour(){
		return colour;
	}
	public void setMake(String colour){
		this.colour=colour;
	}
	public Engine getEngine(){
		return engine;
	}
	public MediaPlayer getMediaPlayer(){
		return mediaPlayer;
	}
	public void setMediaPlayer(MediaPlayer mediaPlayer){
		this.mediaPlayer=mediaPlayer;
	}

	public void diaplayCarInfo(){
		System.out.println("Car details : ");
		System.out.println("---------------------");
		System.out.println("brnad : "+getBrand());
		System.out.println("make : "+getMake());
		System.out.println("price : "+getPrice());
		System.out.println("colour : "+getColour());
		System.out.println();
	}
}