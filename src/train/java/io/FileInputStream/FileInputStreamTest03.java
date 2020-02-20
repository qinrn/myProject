package train.java.io.FileInputStream;

import java.io.FileInputStream;

/**
 * int read(byte[] bytes)
 * 读取之前在内存中先准备一个byte数组， 每次读取多个字节存储到byte数组中
 * 一次读取多个字节，不再单字节读取了
 *
 */
public class FileInputStreamTest03 {
	public static void main(String[] args) throws Exception {
		
		// 1. 创建文件字节输入流
		FileInputStream fis = new FileInputStream("./src/train/java/io/FileInputStream/file01");
		
		//2. 开始读
		byte[] bytes = new byte[3]; 	// 每次读取三个字节
		
		//int read(byte[] bytes);	// 此方法返回的int的值的代表的是：这次读取了多少个字节
		// 读取的是file01的文件，文件内容为abcdefg
		
		int i1 = fis.read(bytes);	// 3
		//将byte数组转化成字符串
		//System.out.println(new String(bytes)); 	//abc
		
		// 将bytes数组的有效部分转化为字符串
		// method： String(byte[] bytes, int offset, int len); 三个参数分别为： 有效数组，起始位置，长度
		System.out.println(new String(bytes,0,i1));
		
		
		int i2 = fis.read(bytes);	// 3
		//将byte数组转化成字符串
		//System.out.println(new String(bytes)); 	//def
		System.out.println(new String(bytes,0,i2));
		
		int i3 = fis.read(bytes);	// 1
		//将byte数组转化成字符串
		//System.out.println(new String(bytes)); 	//gef
		System.out.println(new String(bytes,0,i3));

		int i4 = fis.read(bytes);	// -1 	已经到达文件的末尾返回-1
		//将byte数组转化成字符串
		//System.out.println(new String(bytes)); 	//gef
		
		System.out.println(i1);	// 3
		System.out.println(i2); // 3
		System.out.println(i3); // 1
		System.out.println(i4); // -1
		
		//关闭
		fis.close();
	}
}
