package train.java.io.FileReader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {

	public static void main(String[] args) {

		FileReader fr = null;
		
		try {
			//1. 创建文件字符输入流
			fr = new FileReader("src/train/java/io/FileReader/FileReaderTest01.java");
			//2. 开始读
			char[] chars = new char[512] ; //1KB
			int temp = 0;
			while((temp = fr.read(chars))!= -1) {
				//将char数组有效部分转化为字符串
				System.out.println(new String(chars,0,temp));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//关闭流
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
	}

}
