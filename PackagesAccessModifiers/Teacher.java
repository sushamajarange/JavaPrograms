import  Accesibility.*;
class Teacher extends Student {
	// If the student class is default we can't extend it (now its public)
	// If the variables are private or protected we can not access the variable of class Student without using getter & setter
	private int teacherId;
	private String teacherName;
	Teacher(){	
		teacherId =1;
		teacherName ="Gigisha";
	}
	void printTeacher(){
		System.out.println("Teacher Id : "+teacherId);
		System.out.println("Name : "+teacherName);
	}
	public static void main(String[] args) {
		Teacher t = new Teacher();
		Student stud = new Student();
		// stud.studName ;	// here can't access directly, b'coz studName is protected. If we create setter & getter in class student then we can access. 
		stud.printStudent();  	// if the visibility of printStudent() is protected or private or default then can't access this method
		t.printTeacher();
	}
}
