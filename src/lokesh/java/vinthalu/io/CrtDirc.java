package lokesh.java.vinthalu.io;

import java.io.IOException;
import java.util.Arrays;
import java.io.File;

public class CrtDirc {

	public static void main(String[] args)throws IOException  {

		File file=new File("./ressources/");//for creating 1 directory of folder
		System.out.println(file.mkdir());
		File f=new File("./docs/ssc/");//  for more than one dir
		System.out.println(f.mkdirs());
		File f1=new File("E:\\JavaHunter");
		System.out.println(Arrays.toString(f1.list()) );
		System.out.println(Arrays.toString(f1.listFiles()));
		
	}

}
