import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		int a = 123; 
		Integer b = new Integer(a);  // Boxing 
		Integer c = a; // auto-boxing 
		
		int d = b.intValue();  // unboxing 
		int e = c; // auto-unboxing 
		
		//System.out.println(" a " + a + " b " + b + " c " + c + " d " + d + " e " + e);
		
		
		//Boxing and unboxing are inefficient (it takes more memory and time) 
		Integer x = 12; // auto-boxing  
		Integer y = 2;  // auto-boxing 
		Integer z = x + y; 
			  //x is auto-unboxed to 12 -> primitive 
		      //y is auto-unboxed to 2  -> primitive 
		      // 12 + 2 -> 14 
		// 14 is auto-boxed to z
		
		//java collections store only objects (not primitive values).
		List list = new ArrayList();
		list.add(x); // Integer
		list.add(y); //Integer
		list.add(new Integer(a)); // Boxing 
		list.add(a); //auto-boxing
		
		System.out.println(list);

	}

}
