package lokesh.java.vinthalu.io;

import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args)throws IOException {
	 
		
		File file=new File( "./resume.txt");
	  
		if(file.exists())    //file available or not
	     file.delete();
		else
		file.createNewFile();
	//System.out.println(file);
	}

} 
