package lambda;

//Outer classes can only have: Public, Final, <default>, Abstract, Strictfp
//for rest of the modifier we will get compile time error
class base {
	protected int var1;
	protected String var2;
	
	protected void showVar(){
		System.out.println(var1 + var2);
	}
}

public class AccessModifiers extends base{
	public void setVar(AccessModifiers obj){
		obj.var1 = 2;
		obj.var2 = "BBB";
	}
	
	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers();
		obj.setVar(obj);
		obj.showVar();
	}
}

//Protected member can be accessible by the elements from same package and derived classes from outside package. 
//while, derive class from outside package can only access protected methods and instance variable using it's own reference i.e., by inheritance. They cannot access 
// protected elements by creating reference of parent class 