package lokesh.java.vinthalu.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputStreamEx {

	public static void main(String[] args) throws IOException {
 
		File file=new File("./outputex.txt");
		if(file.exists())
			file.delete();
		System.out.println(file.createNewFile());
		FileOutputStream fos=new FileOutputStream(file);
		String s="hello";
		for(char ch:s.toCharArray()) {
			fos.write((int)ch);
		}
		fos.write(3);
		 

		
		fos.close();
	}

}
