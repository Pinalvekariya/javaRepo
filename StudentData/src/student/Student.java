package student;

public class Student {

	private String name;

	
	public Student() {
	this.name = "Unkown";
}
public Student(String name) {
	this.name = name;
}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static void main(String args[]) {
	Student s1 = new Student();
	Student s2 = new Student("parth");

	
	System.out.println("Student 1 name is : "+ s1.getName());
	System.out.println("Student 2 name is : "+ s2.getName());

}
}
