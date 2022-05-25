package exceptionhandling;
public class JavaExceptionExample{  
	public static void main(String args[]){  
		try{  
			//code that may raise exception  
			String s = null;
			System.out.println(s.length());
			int data=100/0;  
			System.out.println("getting dolo");
		}
		catch(ArithmeticException e){ //exception handler -- chemist
			System.out.println(e);
			System.out.println("get crocin");
		}  
		catch(Exception e) { //doctor next door
			System.out.println("doctor can handle this null pointer exception");
			
		}
		//rest code of the program   
		System.out.println("get the groceries");  
	}  
}  