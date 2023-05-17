package lokesh.java.vinthalu.io;

import java.io.FileInputStream;

public class FileInputStreamEx {

	public static void main(String[] args) {
		try {
		 FileInputStream fin=new FileInputStream("E:\\testout.txt");
		 int i=fin.read();
		 
		 System.out.println(i);
		 System.out.println((char)i);
//		  int i=0;    
//          while((i=fin.read())!=-1){    for reading all characters
//           System.out.print((char)i);    
//          }    
		 fin.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
