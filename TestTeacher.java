package oops;

public class TestTeacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reference variable
		Teacher teacher1=new Teacher();
		teacher1.id=1001;
		teacher1.name="Seema";
		teacher1.subject="Computer Science";
		System.out.println(teacher1.id);
		System.out.println(teacher1.name);
		System.out.println(teacher1.subject);
		//method
		Teacher teacher2=new Teacher();
		teacher2.insertRecord(1002, "Joseph", "Physics");
		teacher2.display();
		//constructor
		Teacher teacher3=new Teacher(1003, "Jinto", "Social Science");
		System.out.println(teacher3.id);
		teacher3.display();
		//using getters and setters
		TeacherClass teacherClass=new TeacherClass();
		teacherClass.setId(1004);
		teacherClass.setName("Remya");
		teacherClass.setSubject("Botany");
		System.out.println(teacherClass.getId());
		System.out.println(teacherClass.getName());
		System.out.println(teacherClass.getSubject());
		//System.out.println(teacherClass.id); this field is private, it is accessible only inside the teacherclass




	}

}
