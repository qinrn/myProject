package train.java.io.FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest01 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			
			//1. 创建文件字节输出流
			
			//每次新建一个输出流文件，会覆盖之前已经写入的内容，须谨慎使用
//			fos = new FileOutputStream("src/train/java/io/FileOutStream/file02");
			
			// 以拼接的方式输出，新的内容在旧的内容后面
			fos = new FileOutputStream("src/train/java/io/FileOutputStream/file02", true);
			
			//2. 写
			String msg = "==> hello,world!";
			
			//将String转化成byte数组
			byte[] bytes= msg.getBytes();
			
			//推荐最后的时候为了保证数据完全写入硬盘，
			fos.flush();  //强制写入
			
			// 将byte数组中的数据全部写入
//			fos.write(bytes);
			
			//将byte数组中的呃部分数据写入
			fos.write(bytes, 0, 5);
			
			System.out.println(new String(bytes));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (fos != null) {
				try {
					// 关闭流
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	
	}

}