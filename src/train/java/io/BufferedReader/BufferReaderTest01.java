package train.java.io.BufferedReader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderTest01 {

	public static void main(String[] args) throws IOException {
		//创建一个带有缓冲区的字符输入流
		/*
		 * FileReader fr = new FileReader(""); BufferedReader br = new
		 * BufferedReader(fr);
		 */
		
		/*
		 * 根据流的位置又可以分为节点流和包装流（处理流） 
		 * FileReader ： 节点流 
		 * BufferedReader ： 包装流
		 */
		
		BufferedReader br = new BufferedReader(new FileReader("src/train/java/io/BUfferReader/BUfferReaderTest01.java"));
		
		//读
		String temp = null;
		while((temp = br.readLine()) != null) { //readLine(); 每次读取一行，且行尾不带换行符
			System.out.println(temp); //输出一行;
		}
		
		br.readLine();
		
		
		//关闭流
		br.close();
	}

}
