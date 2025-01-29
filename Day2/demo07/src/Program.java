
public class Program {

	public static void main(String[] args) {
		int a = 123; 
		String strNumber = String.valueOf(a); //Boxing 
		System.out.println(" a : " +a);
		
		String str = "123"; 
		int b = Integer.parseInt(str); 
		System.out.println(" str : " +str);
	}

}
