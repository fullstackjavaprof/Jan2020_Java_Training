
public class WhileLoopEx {

	public static void main(String[] args) {
        int num=5;
        int count=1;
        int sum=0;
        while(count<=num) {
        	System.out.println(count);
        	sum=sum+count;
        	count=count+1;
        	
        }
        System.out.println(" Sum of num "+sum);
	}

}



