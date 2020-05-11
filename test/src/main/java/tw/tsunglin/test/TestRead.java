package tw.tsunglin.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class TestRead {

	public static void main(String[] args) throws IOException {
		FileInputStream tmp = new FileInputStream(new File("D://test.txt"));
		InputStreamReader t = new InputStreamReader(tmp, "UTF-8");
		BufferedReader bf = new BufferedReader(t);
//		CommonReader read = new CommonReader(bf);
		System.out.println("");
		bf.close();
		String a = bf.readLine();
		System.out.println(a);

	}

}
