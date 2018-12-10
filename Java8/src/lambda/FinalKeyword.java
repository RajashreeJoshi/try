package lambda;

public class FinalKeyword {
	//final int a; //compile time error. Final variable should be initialized
	
	final int a = 5;
	
	void changeVar(final int var){
		// a = var; // compile time error
	}

	public static void main(String[] args) {
		FinalKeyword obj = new FinalKeyword();
		obj.changeVar(5);
		System.out.println(obj.a);
	}

}
