package lokesh.java.vinthalu.io;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class BufferedReaderEx {

	public static void main(String[] args) throws IOException {
 
		File file=new File("./sample.txt");
		 if(!file.exists())
			 file.createNewFile();
		 FileReader fr=new FileReader(file);
		 FileInputStream fis=new FileInputStream(file);
		 InputStreamReader isr=new InputStreamReader(fis);
 		BufferedReader br=new BufferedReader(fr);
 		BufferedReader br1=new BufferedReader(isr);	//another way with fileinputstream reader 	
 		//int asciiCode;
//			String text="";
//		 
//			 while((asciiCode=br.read())!=-1) {
//				 text+=String.valueOf((char)asciiCode); //we can get data int ascii format or line format
 //			//System.out.print((char)asciiCode);          //
//			 }                                         //bufferedreader can get values in file reader format
 		                                                 //file input stream format
//			 System.out.println(text);
		String text=new String();
		String line="";
		while((line=br.readLine())!=null) {
			System.out.println(line);
			text+=line+"\n";//calling line wise
		}
		System.out.println(text);
		fr.close();
		br.close();
		br1.close();
	}

}
