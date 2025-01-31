package demo2;

public class TestDemo {
public static void main(String[] args) {
	divide(20, 2);
	divide(30,5);
	divide(30,3);
	divide(10,2);
	
}	
	
public static void divide(int a,int b) {
	System.out.println(a/b);
}	
public static int getResult(int a,int b)	{
	int result =0;
if (a >0){
	System.out.println("number is a positive number");
}else {
	System.out.println("number is a negative number");
}

	return result;
}

}	

