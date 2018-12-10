package lambda;

import java.util.ArrayList;

public class TestLambda {
	public void method(Object o){
		System.out.println("Hey");
	}
	
	public void method(String o){
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		TestLambda obj = new TestLambda();
		 ArrayList<Integer> array = new ArrayList<>();
		 array.add(1);
		 array.add(2);
		 array.add(3);
		 array.add(4);
		 
		 array.forEach(item-> System.out.println(item));

		 String str = null;
		 System.out.println(str);
		 
		 obj.method(null);
	}
}
