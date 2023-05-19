package lokesh.java.vinthalu.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NoLinesInFile {

	public static void main(String[] args) throws IOException {
	 
		File file=new File("./parctice1.txt");
		if(file.exists())
			file.delete();
		
	System.out.println(	file.createNewFile());
		 BufferedWriter bw=new BufferedWriter(new FileWriter(file));
		bw.write("hello");
		bw.newLine();
		bw.write("my name is loki");
		bw.newLine();
		bw.write(" pursuing MCA");
		bw.newLine();
		bw.write("tirupati");
		bw.newLine();
		bw.write("SVU");
		bw.newLine();
		bw.write("lokesh");
		bw.newLine();
		bw.write("end.");
		bw.flush();
		bw.close();
		
		
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
//		int count=0;
//		while(br.readLine()!=null) {
//			count++;
//		}
//			
//	
//		System.out.println(count);
		
		String s="";int i=0;int j=0;int count1=0;
		while((s=br.readLine())!=null) {
			j++;
			 if(s.length()>i) {
				 i=s.length();
				 count1=j;
			 }
		}
			
	
		System.out.println(count1);
		
		
		
//		int count1=0;int i=0;int ct=0;int j=1;
//		int c;
//		while((c=br.read())!=-1) {
//			System.out.println(c);
//			 if(c!=13 && c!=10) {
//				 
//				 count1++;
//			 }
//			 else if(count1>ct) {
//				 count1=ct;
//			 }
//		}
		br.close();
	}

}
