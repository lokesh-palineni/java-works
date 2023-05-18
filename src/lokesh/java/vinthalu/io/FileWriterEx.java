package lokesh.java.vinthalu.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) throws IOException {
		 
		File file=new File("./outputex.txt");
		if(file.exists())
			file.delete();
		System.out.println(file.createNewFile());
		FileWriter fw=new FileWriter(file);
		 String s="hello world";
		 fw.write(s);
		 fw.flush();
		 fw.close();
	}

}
