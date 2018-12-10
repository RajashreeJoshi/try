package lambda;

public class Garbage {
	public static void main(String[] args) {
		System.gc();
		
		Runtime.getRuntime().gc();
	}
	
	@Override
	public void finalize(){
		System.out.println("It is GC");
	}
}
