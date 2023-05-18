package lokesh.java.vinthalu.io;

import java.io.FileOutputStream;

public class FileOutputStr {

	public static void main(String[] args) {
		 
		try {
			FileOutputStream fout=new FileOutputStream("E:\\testout.txt");
			fout.write(65);
			String s="welcome to javaTpoint";
			byte[] b=s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("success...");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
