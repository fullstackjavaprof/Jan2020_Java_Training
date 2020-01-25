class Employee{  
   int empno;//instance variable  
   String name;  
   static String companyName ="TCS";//static variable  
   
   static{
	   System.out.println("static block is invoked");
	   }  

   
   //constructor  
   Employee(int r, String n){  
	   empno = r;  
	   name = n;  
   }  
   static void changeCompanyName(){  
	   companyName = "IBM";  
	     } 
   void display (){System.out.println(empno+" "+name+" "+companyName);}  
}  
public class TestStaticVariable1{  
 public static void main(String args[]){  
	 Employee e1 = new Employee(111,"Karan");  
	 Employee e2 = new Employee(222,"Aryan");  
	 Employee e3 = new Employee(333,"Vasu");
 //we can change the college of all objects by the single line of code  
	// Employee.companyName="IBM"; 
	 Employee.changeCompanyName(); 
 e1.display();  
 e2.display();  
 e3.display();
 }  
} 
