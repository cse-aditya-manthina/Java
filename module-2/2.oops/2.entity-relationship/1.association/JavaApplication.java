 class JavaApplication{
	public static void execution(){

		// Engine engine=new Engine(1000,150,4);



		// MediaPlayer mediaplayer=new MediaPlayer("jbl",30000.90,"India");

		// //dependency injection - constructor
		// Car car=new Car("BMW","Black","Germany",1000000.00,engine);

		// car.diaplayCarInfo();
		// car.getEngine().displayEngineInfo();

		// // dependency injection - setter method
		// car.setMediaPlayer(mediaplayer);
		// car.getMediaPlayer().displayMediaPlayerInfo();

		Student student =new Student(1,"amrutha","amrutha@gmail.com",1234567897);
		student.displayStudnetInfo();

		Project project=new Project(1,"e-commerce","java web application");

		// student will create new project
		student.createProject(project);

		//student will read the project
		student.readProject();

		// student will update existing project
		student.updateProject(1,"air line booking","python web application");

		student.readProject();

		student.deleteProject(1);


	}
}