class Student{
	private int id;
	private String name;
	private String mailId;
	private long contactNum;
	private Project project;
	public Student(){

	}
	public Student(int id,String name,String mailId,long contactNum){
		this.id=id;
		this.name=name;
		this.mailId=mailId;
		this.contactNum=contactNum;
	}

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;

	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getMailId(){
		return mailId;
	}
	public void setMailId(String mailId){
		this.mailId=mailId;
	}
	public long getContactNum(){
		return contactNum;
	}
	public void setContactNum(long contactNum){
		this.contactNum=contactNum;
	}
	public Project getProject(){
		return project; 
	}
	public void setProject(Project project){
		this.project=project;
	}
	public void displayStudnetInfo(){
		System.out.println("Student info : ");
		System.out.println("----------------");
		System.out.println("id : "+getId());
		System.out.println("name : "+getName());
		System.out.println("mailId : "+getMailId());
		System.out.println("contactNum : "+getContactNum());

	}   
	 public void createProject(Project project) {
        if (getProject() == null && project != null) {
            setProject(project);
            System.out.println("Project created");
        } else {
            System.out.println("Project not created");
        }
    }

    public void readProject() {
        if (getProject() != null) {
            getProject().displayProjectInfo();
        } else {
            System.out.println("Project not displayed");
        }
    }

    public void updateProject(int id, String name, String description) {
        if (getProject() != null && getProject().getId() == id) {
            getProject().setName(name);
            getProject().setDescription(description);
            System.out.println("Project updated");
        } else {
            System.out.println("Project not updated");
        }
    }

    public void deleteProject(int id) {
        if (getProject() != null && getProject().getId() == id) {
            setProject(null);
            System.out.println("Project deleted");
        } else {
            System.out.println("Project not deleted");
        }
    }
}
