package lokesh.java.vinthalu.exhandling;

public class CmdLingEx {
	

	public static void main(String[] args) {
		try {
 
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		 
		int c=a/b;
		System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println("0 cannot be devided");
		}
		catch(NumberFormatException e) {
			System.out.println("enter a valid number");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("enter two values");
		}
	}

}
