package lokesh.java.vinthalu.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInpustStreamEx {

	public static void main(String[] args) throws IOException{
		 
	 File file=new File("./sample.txt");
	 if(!file.exists())
		 file.createNewFile();
	 // file.delete();
	  
	 FileInputStream fis=new FileInputStream(file);
	int asciiCode;
	String text="";
 
	 while((asciiCode=fis.read())!=-1) {
		 text+=String.valueOf((char)asciiCode);
	System.out.print((char)asciiCode);
	 }
	 System.out.println(text);
	 fis.close();
	}

	 
}
