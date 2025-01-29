
public class Program {

	public static void main(String[] args) {
		//Converting primitive to Wrapper -> Boxing 
		int a = 123; 
		Integer b = new Integer(a); // Boxing 
		
		//Converting Wrapper to primitive -> unboxing 
		int c = b.intValue(); 

	}

}
