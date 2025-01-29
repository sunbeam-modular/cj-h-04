import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int num1 , num2 , res; 
		String op; 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the num1 and num2  : ");
		num1 = sc.nextInt(); 
		num2 = sc.nextInt(); 
		do {
			System.out.println("Enter + , - , * , / or . to exit");
			op = sc.next(); // + 
			switch (op) {
			case "+":
				res = num1 + num2; 
				System.out.println("res : "+res);
				break;
			case "-":
				res = num1 - num2; 
				System.out.println("res : "+res);
				break;
			case "*":
				res = num1 * num2; 
				System.out.println("res : "+res);
				break;
			case "/":
				res = num1 / num2; 
				System.out.println("res : "+res);
				break;

			}
			
		} while (!op.equals(".")); //+ 
	}

}
