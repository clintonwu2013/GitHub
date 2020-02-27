package tw.tsunglin.test;

/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class CommonReader extends BufferedReader {
	public CommonReader(Reader in) {
		super(in);
	}

	public String readLine(int max) throws IOException {
		int currentPos = 0;
		int[] buffer = new int[max];
		int ch;
		do {
			ch = read();

			if ((ch != 10) && (ch != -1) && (ch != 13)) {
				buffer[(currentPos++)] = ch;
			}

			if (currentPos > max)
				throw new IOException("line length is greater than " + max);
		} while ((ch != 10) && (ch != -1));

		if ((currentPos == 0) && (ch == -1)) {
			return null;
		}

		if (currentPos > 0) {
			byte[] b = new byte[currentPos];
			for (int i = 0; i < currentPos; ++i) {
				b[i] = (byte) buffer[i];
			}
			return new String(buffer, 0, currentPos);
		}

		return "";
	}
}
