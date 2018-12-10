package lambda;

class StaticDemo{
	static int no;
	
	static void show(){
		System.out.println("Hello");
	}
}
public class StaticVariable {
	public static void main(String[] args) {
		StaticDemo obj = new StaticDemo();
		StaticDemo obj1 = new StaticDemo();
		
		obj.no = 10;
		obj1.no = 20;
		StaticDemo.no = 30;
		
		System.out.println("No Obj: "+ StaticDemo.no);
		System.out.println("No Obj: "+ StaticDemo.no);
		System.out.println("No Obj: "+ StaticDemo.no);
		
		obj.show();
		obj.show();
		StaticDemo.show();
	}
}
