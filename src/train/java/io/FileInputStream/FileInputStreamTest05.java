package train.java.io.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest05 {

	public static void main(String[] args) throws IOException {
		
		//1. 创建文件字节输入流
		FileInputStream fis = new FileInputStream("./src/train/java/io/FileInputStream/file01");
		
		//2.
		System.out.println(fis.available());
		
		System.out.println(fis.read());
		
		System.out.println(fis.available());
		
		
		// 跳过2个字节
		fis.skip(2);
		
		System.out.println(fis.available());
		
		// 关闭
		fis.close();
		
	}

}
