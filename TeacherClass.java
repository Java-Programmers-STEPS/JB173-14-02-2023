package oops;

public class TeacherClass {
//bean class
	private int id;
	private String name,subject;
	public int getId() {//read id
		return id;
	}
	public void setId(int id) {//write id
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
}
