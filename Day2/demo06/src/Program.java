
public class Program {

	public static void main(String[] args) {
		int a = 123;
		//converting primitive to wrapper --> Boxing 
		Integer b = new Integer(a); // Boxing 
		//converting primitive to wrapper Integer--> auto-Boxing
		Integer c = a; // auto-boxing 
		
		//converting wrapper Integer to primitive -> auto-unboxing 
		int d = c; //auto-unboxing 

	}

}
