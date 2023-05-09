package lokesh.java.vinthalu.exhandling;

public class ThrowsEx {

	public   int divideNum(int m, int n) throws ArithmeticException {  
        int div = m / n;  
        return div;  
    }  
	public static void main(String[] args) {
 
		ThrowsEx obj=new ThrowsEx();
		   try {  
	            System.out.println(obj.divideNum(45, 0));  
	        }  
	        catch (ArithmeticException e){  
	            System.out.println("\nNumber cannot be divided by 0");  
	        }  
	          
	        System.out.println("Rest of the code..");  
	}

}
