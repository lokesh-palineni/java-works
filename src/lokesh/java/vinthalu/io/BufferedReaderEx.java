package lokesh.java.vinthalu.io;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class BufferedReaderEx {

	public static void main(String[] args) throws IOException {
 
		File file=new File("./sample.txt");
		 if(!file.exists())
			 file.createNewFile();
		 FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		
		
		fr.close();
		br.close();
	}

}
