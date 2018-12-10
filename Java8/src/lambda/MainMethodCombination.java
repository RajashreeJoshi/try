package lambda;

public class MainMethodCombination {
	
	//1.We can rename the main method but we need to customize our JVM

	//2.Works fine. Output: Valid Main Method
	/*final synchronized strictfp public static void main(String... args) {
		System.out.println("Valid Main Method");
	}*/
	
	//3.Main Method Overloading : It is possible but JVM will always call  main with this signature public static void main(String[] a)
	//We need to call overloaded main method explicitly 
	
	/*public static void main(String[] a){
		int array[] = {1,2};
		System.out.println("String[]");
		main(array);
	}
	
	public static void main(int[] a){
		System.out.println("Int[]");
	}*/
	
	//4. Inheritance is applicable to main method without fail. Meaning that, if only parent is containing Main method but child does not
	//then no compilation error will be there. We will get two .class files [as for every class Compiler creates two .class files].
	//Now if you run any one of them, the parent's main method will get called.
	//In short, even if child does not contain main method, you will not get compile time error. Instead parent's main method will be invoked.
	//consider ex class created below for this case.
	
	/*public static void main(String[] args){
		System.out.println("Parent Main");
	}*/
	
	//5. Main method overriding. It seems method overriding concept is applicable for main method but it actually method hiding not method overriding.
	//now here, when you run the program and run parent's .class file you will get : Parent Main for case 5
	//and when you run child's .class file, you will get output : Child Main for case 5
	/*public static void main(String[] args){
		System.out.println("Parent Main for case 5");
	}	*/
	
	//6. only static block in class but no main. Runtime Error! JVM wont start execution without main method
	
	/*static {
		System.out.println("Static Block");
	}*/
	
	//7. If the class contains main method and static block. Always main method is going to execute first.
	static {
		System.out.println("Static Block");
	}
	
	public static void main(String[] args){
		System.out.println("Example Seven");
	}
}
/*
class ex extends MainMethodCombination {
	
}*/

/*class ex_case5 extends MainMethodCombination {
	public static void main(String[] args){
		System.out.println("Child Main for case 5");
	}	
}*/