package com.sunbeam;

public class Program {

	public static void main1(String[] args) {
		StringBuffer sb = new StringBuffer(); 
		sb.append("Nilesh"); 
		sb.append(40); 
		sb.append('M'); 
		sb.append(75.45); 
		String str = sb.toString(); 
		System.out.println(str);

	}
	public static void main2(String[] args) {
		// capacity is size of internal char array
	    // length is number of chars stored in that array
		StringBuffer sb = new StringBuffer(); 
		sb.append("0123456789");
		System.out.printf("Length : %d Capacity : %d\n",sb.length(),sb.capacity());
		sb.append("ABCDEF"); 
		System.out.printf("Length : %d Capacity : %d\n",sb.length(),sb.capacity());
		sb.append("GHIJKL"); 
		System.out.printf("Length : %d Capacity : %d\n",sb.length(),sb.capacity());
	}
	public static void main3(String[] args) {
		//reverse()
		String str = "Sunbeam"; 
		StringBuffer sb = new StringBuffer(str); 
		sb.reverse(); 
		System.out.println("Reverse : "+sb.toString());
		System.out.println("Str : "+str);
	}
	public static void main4(String[] args) {
		// equals() ( == , equals)
		StringBuffer sb1 = new StringBuffer("Sunbeam"); 
		StringBuffer sb2 = new StringBuffer("Sunbeam"); 
		
		System.out.println("(sb1 == sb2) : " + (sb1 == sb2) );
		System.out.println("sb1.equals(sb2) : " + sb1.equals(sb2) );
		//equals() is not overridden in StringBuffer class.
		//So Object.equals() is called, that compares references.
	}
	public static void main5(String[] args) {
	// StringBuffer (since Java 1.0) is thread-safe.
	// Internally uses synchronization objects, which slow down the execution.
	// StringBuilder (since Java 5.0) is not thread-safe.
	//Not using synchronization objects, due to which it is faster than StringBuffer.
	// StringBuilder methods are same as StringBuffer methods.
		String str = "Sunbeam"; 
		StringBuilder sb = new StringBuilder(str);
		sb.reverse(); 
		System.out.println(sb.toString());
	}
	
	public static void main6(String[] args) {
		 class Box{
			 private int length , breadth , height;
			 
			public Box() {
				// TODO Auto-generated constructor stub
			} 
			public Box(int length, int breadth, int height) {
				this.length = length;
				this.breadth = breadth;
				this.height = height;
			}
			/*
			//creating string with string concatenation is not efficient( space and time)
			@Override
			public String toString() {
				return "Box [length=" + length + ", breadth=" + breadth + ", height=" + height + "]";
			}*/
			//more efficient than string concatenation -- String.format() since Java 5.0
			/*
			@Override
			public String toString() {
				return String.format("Length = %d Breadth = %d Height = %d", this.length,this.breadth,this.height); 
			}
			*/ 
			/*
			//more efficient than string concatenation -- Since Java 1.0
			@Override
			public String toString() {
				StringBuffer sb = new StringBuffer(); 
				sb.append(" Length : "); 
				sb.append(this.length); 
				sb.append(", Breadth : "); 
				sb.append(this.breadth); 
				sb.append(", Height : "); 
				sb.append(this.height); 
				
				return sb.toString(); 
 			}*/ 
			@Override
			public String toString() {
				StringBuilder sb = new StringBuilder(); 
				String str = 
						sb.append("Length : ")
						.append(this.length)
						.append(",Breadth : ")
						.append(this.breadth)
						.append(",Height : ")
						.append(this.height)
						.toString(); 
				return str; 
			}
			
			 
		 }
		 Box b1 = new Box(10, 10, 10); 
		 System.out.println("b1 : "+b1.toString());
	}
	public static void main(String[] args) {
		String str = "Sunbeam"; 
		StringBuffer sb = new StringBuffer("Sunbeam"); 
		//System.out.println("Equals : "+str.equals(sb));
		System.out.println("Equals : "+str.equals(sb.toString()));
	}

}
