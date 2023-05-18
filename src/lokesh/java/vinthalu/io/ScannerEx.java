package lokesh.java.vinthalu.io;

import java.io.File;
//import java.io.FileInputStream;
import java.io.IOException;
//import java.io.InputStream;
import java.util.Scanner;
public class ScannerEx {

	public static void main(String[] args) throws IOException {
		 
		File file=new File("./sample.txt");
		 if(!file.exists())
			 file.createNewFile();
//		 
//		 FileInputStream fis=new FileInputStream(file);
//		 Scanner sc1=new Scanner(fis);         //diff ways for create
//		 Scanner sc2=new Scanner(new FileInputStream(file));
		 Scanner sc=new Scanner(file);
		
		 String text="";
		 while( sc.hasNextLine()) {
			 text+=sc.nextLine()+"\n";//to store in string format
			// System.out.println(sc.nextLine());  directly display
		 }
		
		System.out.print(text);
		 sc.close();
//		 sc1.close();
//		 sc2.close()
	}

}
