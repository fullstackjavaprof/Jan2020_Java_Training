
public class Student {
	
	int sno;
	String sname;
	
	public Student(){
		sno=10;
		sname="Ramu";
	}
	
	 Student(int stno,String stname) {
		sno=stno;
		sname=stname;
	}
	
	void display() {
		System.out.println("Student no : "+sno);
		System.out.println("Student name : "+sname);
	}
	

}
