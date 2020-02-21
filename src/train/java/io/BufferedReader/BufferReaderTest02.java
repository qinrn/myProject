package train.java.io.BufferedReader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderTest02 {

	public static void main(String[] args) throws IOException {
		
		//创建流
		/*
		 * FileInputStream fr = new FileInputStream(""); //字节流转换为字符流 InputStreamReader
		 * isr = new InputStreamReader(fr);
		 * 
		 * BufferedReader br = new BufferedReader(isr);
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src/train/java/io/BUfferReader/BufferReaderTest02.java"))); 
		
		String msg = null;
		while((msg = br.readLine()) != null) {
			System.out.println(msg);
		}
		
		// 关闭,关闭最外层的流即可
		br.close();
	}

}
