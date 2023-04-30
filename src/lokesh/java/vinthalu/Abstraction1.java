package lokesh.java.vinthalu;

abstract class Example{       //rule 1:declare as abstract
	 abstract void m1();       //rule 2:declare as abstract
	}
 class Sample extends Example{
	 void m1() {             // rule 3:must implement in sub class
		 System.out.println("m1 is executed from class sample");
	 }
 }
public class Abstraction1 {
	 public static void main(String arg[]) {
		 Example e1;
		 // e1=new Example(); error    //rule 4:we can't instantiate
		 e1=new Sample();
		 e1.m1();
	 }

}
