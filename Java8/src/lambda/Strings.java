package lambda;

public class Strings {

	public static void main(String[] args) {
		//1. String Buffer vs String
		/*String s = new String("Rajashree");
		s.concat("Joshi");
		System.out.println(s);
		
		String str = "Rajashree";
		str.concat("Joshi");
		System.out.println(str);
		
		StringBuffer sb = new StringBuffer("Rajashree");
		sb.append("Joshi");
		System.out.println(sb);*/
		
		//2. == vs .equals()
		// == is meant for reference/address comparison and .equals() meant for content/value comparison
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		System.out.println(".equals: "+ s1.equals(s2));
		System.out.println("==: "+ (s1 == s2));	
	}

}
