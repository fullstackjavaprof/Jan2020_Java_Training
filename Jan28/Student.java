
public class Student {
	
	int sno;
	String sname;
	
	public Student(){
		sno=10;
		sname="Ramu";
	}
	
	 Student(int sno,String sname) {
		this.sno=sno;
		this.sname=sname;
	}
	
	void display() {
		System.out.println("Student no : "+sno);
		System.out.println("Student name : "+sname);
	}
}
