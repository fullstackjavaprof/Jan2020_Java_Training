
 class Test1{
	final int a=10;
	final int b=20;
	final int add()
	{
		return a+b;
	}
	
}
class Test2 extends Test1{
	
	public void print() {
		System.out.println(super.add());
	}
}



public class TestFinalKeyword {

	public static void main(String[] args) {
		Test2 test2=new Test2();
		test2.print();
	}

}
