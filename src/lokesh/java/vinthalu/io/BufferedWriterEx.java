package lokesh.java.vinthalu.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {

	public static void main(String[] args) throws IOException {
 
		
		File file=new File("./outputex.txt");
		if(file.exists())
			file.delete();
		System.out.println(file.createNewFile());
		
		 BufferedWriter bw=new BufferedWriter(new FileWriter(file));
		String s="world";
				
		 bw.write(s);
		 
		 
		 bw.close();
	} 

}
