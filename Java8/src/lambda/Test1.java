package lambda;

class parent{
	int i;
	protected int j;
	
}

public class Test1 extends parent{
	int j;
	
	void display(){
		super.i = 10;
		super.j = 20;
		System.out.println(i + " " +j);
	}

	public static void main(String[] args) {
		Test1 obj = new Test1();
		obj.i = 5;
		obj.j = 4;
		
		obj.display();
	}
}
