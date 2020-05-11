package tw.tsunglin.leetcode1015;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileWriteTest {
	public static void main(String args[])throws IOException{

	      File file = new File("D:/Hello1.csv");
	      // creates the file
	      file.createNewFile();
	      // creates a FileWriter Object
	      FileWriter writer = new FileWriter(file); 
	      BufferedWriter bufferedWriter = new BufferedWriter(writer);
	      
//	      InputStream a = new
//	    			 FileInputStream(file);
//	      a.read(new byte[1024]);
	      // Writes the content to the file
	      bufferedWriter.write("This is an example,N");
	      bufferedWriter.newLine();
	      bufferedWriter.write("This is an example2,N2");
	      bufferedWriter.close();
	      writer.close();

	      //Creates a FileReader Object
	      FileReader fr = new FileReader(file); 
	      char [] a = new char[50];
	      fr.read(a); // reads the content to the array
	      for(char c : a)
	          System.out.print(c); //prints the characters one by one
	      fr.close();
	   }
	

}
