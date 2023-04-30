package lokesh.java.vinthalu;

abstract class Example1{
	abstract void m1();
	abstract void m2();
}
abstract class Sample1 extends Example1{
	void m1() {
		System.out.println("m1 is executed from class Sample");
	}
}
class Xyz extends Sample1{
	void m2() {
		System.out.println("m2 method executed from xyz");
	}
}
class Pqr extends Xyz{
	void m2() {
		System.out.println("m1 is executed from class pqr");
	}
}
public class MultipleabstrctMethods {

	public static void main(String[] args) {
     Example1 e,e2;
    // e=new Example1;
    // e=new Sample1;
     e=new Xyz();
     e2=new Pqr();
     e.m1();
     e.m2();
     e2.m1();
     e2.m2();
	}

}
