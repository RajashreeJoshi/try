package lambda;

import java.io.PrintWriter;

class EX0 extends Exception {}

class EX1 extends EX0 {}

public class Exceptions {

	public static void main(String[] args) {
		/*//the below line will throw error bz we are not handling checked exceptions
		//PrintWriter pw = new PrintWriter("abc.txt");
		System.out.println(10/0);*/
		
		try{
			throw new EX1();
		}
		catch(EX0 e){
			System.out.println("EX0 Caught");
		}
		catch(Exception e){
			System.out.println("Exception Caught");
		}
		
		System.out.println("Hey Yah!");
	}

}
