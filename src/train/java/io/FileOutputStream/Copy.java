package train.java.io.FileOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//复制粘贴
public class Copy {
	public static void main(String[] args) throws IOException {
		
		//创建输入流
		//每次执行 ， 会覆盖上一次的内容
		FileInputStream fis = new FileInputStream("src/train/java/io/FileOutputStream/file02");  
		//创建输出流
		FileOutputStream fos = new FileOutputStream("D:/file02.txt");
		
		//读
		byte[] bytes = new byte[1024];
		while(true) {
			int temp = fis.read(bytes);
			
			if (temp == -1) break;
			//写
			fos.write(bytes);
		}
		
		
		//强制刷新
		fos.flush();
		
		//关闭流
		fis.close();
		fos.close();
	}
}
