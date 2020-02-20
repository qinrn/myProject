package train.java.io.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 文件字节输入流
 * 	按照字节方式读取文件
 */
public class FileInputStreamTest01 {
	
	
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			//1.要读取某文件，先要创建一个输入流
			
			//文件路径
			String filePath = "./src/train/java/io/FileInputStream/file01"; //相对路径,相对当前而言，在当前路径下找
//			String filePath1 = "D:\\workspace\\exercise\\myProject\\src\\train\\java\\io\\FileInputStream\\file01"; //绝对路径
//			String filePath2 = "D:/workspace/exercise/myProject/src/train/java/io/FileInputStream/file01"; //绝对路径
			fis = new FileInputStream(filePath);
			
			//2. 读文件
			
			// 此时file01文件内容为：abcdef
			int i1 = fis.read();    // 以字节的方式读取,读取的是一个字节的数据，读取的是ASCII码
			int i2 = fis.read();  
			int i3 = fis.read();
			int i4 = fis.read();
			int i5 = fis.read();
			int i6 = fis.read();
			int i7 = fis.read();
			
			System.out.println(i1);  // 97   ASCII码  自动转化
			System.out.println(i2);  // 98
			System.out.println(i3);  // 99
			System.out.println(i4);  // 100
			System.out.println(i5);  // 101
			System.out.println(i6);  // 102
			System.out.println(i7);  // -1   读到文件的末尾会返回值  -1；
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			// 为了保证一定会释放，所以在finally语句块中执行
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			
		}
	}
}
