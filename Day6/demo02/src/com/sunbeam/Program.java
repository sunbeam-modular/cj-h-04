package com.sunbeam;

public class Program{
    private static int number;  //OK
    public static void print( ){
        //static int number = 0;  //Not OK
        number = number + 1;
        System.out.println("Number  :   "+number);
    }
    public static void main(String[] args) {
        Program.print();    //1
        Program.print();    //2
        Program.print();    //3
    }
}
