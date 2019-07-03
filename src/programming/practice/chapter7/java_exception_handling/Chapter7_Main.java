package programming.practice.chapter7.java_exception_handling;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

public class Chapter7_Main {
	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		int result = 0;
		
		try {
			result = a/b;
		} catch (ArithmeticException e) {
			System.out.println("You can't devide" +a + " by " + b);
		}
		
		System.err.println("Result: "+result);
	}

}
