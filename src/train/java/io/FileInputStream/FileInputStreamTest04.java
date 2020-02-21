package train.java.io.FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

// 循环读取
public class FileInputStreamTest04 {
	public static void main(String[] args) throws IOException {
		
		//1. 创建文件字节输入流
		FileInputStream fis = new FileInputStream("./src/train/java/io/FileInputStream/FileInputStreamTest04.java");
		
		//2. 开始读
		
		//2.1 读书组的话，先准备一个byte数组
		byte[] bytes = new byte[1024]; 	// 意味着每次读取1024个字节，即1kb
		
		/*
		 * while (true) { 
		 * 
		 * int i1 = fis.read(bytes);
		 * 
		 * if (i1 == -1) break ;
		 * 
		 * System.out.println(new String(bytes,0,i1)); }
		 */
		
		// 升级循环
		
		int temp = 0;
		while((temp = fis.read(bytes)) != -1) {
			System.out.print(new String(bytes,0,temp));
		}
		
		//关闭
		fis.close();
		
	}
}
