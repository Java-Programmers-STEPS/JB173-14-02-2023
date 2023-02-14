package oops;

public class Teacher {
	int id;
	String name,subject;
	
	void insertRecord(int id,String name,String subject)
	{
		this.id=id;
		this.name=name;
		this.subject=subject;
	}
	
	void display()
	{
		System.out.println("Id: "+id+" Name: "+name+" Subject: "+subject);
	}
	
	public Teacher(int id,String name,String subject) {
		this.id=id;
		this.name=name;
		this.subject=subject;
	}
	public Teacher() {
	}

}
