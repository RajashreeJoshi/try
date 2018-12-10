package lambda;

//1.Interface in another interface
//Tips: 
//a. Interface declared inside a Class is always static.
//b. Interface/Class inside another Interface is always public & static.

interface inter{
	void m2();
	interface inter1{
		void m1();
	}
}
public class Interfaces implements inter.inter1, inter{

	public static void main(String[] args) {
		Interfaces obj = new Interfaces();
		obj.m1();
		obj.m2();
	}
	
	@Override
	public void m1() {
		System.out.println("Inner Interface");
	}
	
	@Override
	public void m2() {
		System.out.println("Outer Interface");
	}
	
}
