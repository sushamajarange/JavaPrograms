package Accesibility;

public class Student {
	private int studId;
	 String studName;
	public Student(){
		studId =1;
		studName ="Sara";
	}
	public void printStudent(){
		System.out.println("Roll Number : "+studId);
		System.out.println("Name : "+studName);
	}
	public static void main(String[] args) {
		Student s1 = new Student();
	}

}
