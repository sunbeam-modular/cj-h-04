
public class Program {

	public static void main(String[] args) {
		short s = 10; 
		int i = s; // OK ( Widening) 
		System.out.println(" i : " + i);
		
		int x = 20; 
		//short p = i; //Narrowing
		short p = (short) i; //Narrowing
		System.out.println(" p : " +p);
	}

}
