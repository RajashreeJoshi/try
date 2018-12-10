package lambda;

class A {
	int b;
	
	int sub(int a){
		return a - a;
	}
}
public class Test extends A {
	int a;
	
	int add(int a){
		return a + a;
	}
	public static void main(String[] args) {
		//This will give you compile time error because Parent Reference can only see it's own data member and member functions not CHILD's.
		//But child can see data member and member function of Parent and itself too
		
		//A obj = new Test(); // here obj is parent's reference
		//System.out.println(obj.add(5)); //error
		//System.out.println(obj.a); //error
		
		Test obj = new Test(); // now obj is child's reference
		//child can access all the data now
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.add(5));
		System.out.println(obj.sub(4));
		
	}

}
