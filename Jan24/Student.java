
public class Student {
	
	int sno;
	String sname;
	
	void insertStudentData(int stno,String stname) {
		sno=stno;
		sname=stname;
	}
	
	void display() {
		System.out.println("Student no : "+sno);
		System.out.println("Student name : "+sname);
	}
	

}
