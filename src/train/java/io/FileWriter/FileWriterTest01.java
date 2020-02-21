package train.java.io.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {

	public static void main(String[] args) throws IOException {

		//1. 创建文件字符输出流
//		FileWriter fw = new FileWriter("D:/temp03.txt"); //覆盖
		FileWriter fw = new FileWriter("D:/temp03.txt",true);
		
		//写
		String msg = "武汉加油 ！" ; 
		char[] chars = {'中','国','加','油','！','！'};
		
//		fw.write(msg);
		fw.write(chars, 0, 4);
	
		//强制刷新
		fw.flush();
		
		//关闭流
		fw.close();
	}

}
