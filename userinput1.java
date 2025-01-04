package chapter6;

import java.util.Scanner;

public class userinput1 {
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name");
		String name = sc.nextLine();
		System.out.println("Enter age");
		int age = sc.nextInt();
		sc.nextLine();//it is used whenever I use String after int
		System.out.println("Enter Address");
		String address = sc.nextLine();
		
		
		
		
		System.out.println("My name is "+name);	
		System.out.println("My age is "+age);	
		System.out.println("address is "+address);
		
		
	}

}
