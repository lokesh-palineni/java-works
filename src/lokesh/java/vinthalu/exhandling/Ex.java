package lokesh.java.vinthalu.exhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
			
			System.out.println("enter numbers");
			
			 
			 
			try {
				int a=sc.nextInt();
				int b=sc.nextInt();
				int c=a/b;
			System.out.println(c);
			}
			
			catch(InputMismatchException e) {
				System.out.println(e);
			}
			 
		
			catch(NumberFormatException e) {
				System.out.println("enter a valid number");
			}
		
			 
			 catch(ArithmeticException e) {
					System.out.println("0 cannot be devided");
				}
		
		sc.close();
	}

}
