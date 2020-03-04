package train.java.io.DataInput_OutputStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 数据字节输出流
 * 可以将内存中的"int i = 10;" 写入到硬盘文件中
 * 带类型写入 
 * */
public class DataOutPutStreamTest01 {

	public static void main(String[] args) throws IOException {
		//1. 创建字节输出流
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/train/java/io/DataInput_OutputStream/temp05.txt"));
		// 准备数据
		byte b = 10 ;
		short s = 11 ;
		int i = 12 ;
		long l = 13 ;
		float f = 14 ;
		double d = 15 ;
		boolean flag = false ;
		char c = 'a';
		// 因输出是来数据类型一起输出的，所以这个文件是二进制文件，打不开
		dos.writeByte(b);
		dos.writeShort(s);
		dos.writeInt(i);
		dos.writeLong(l);
		dos.writeFloat(f);
		dos.writeDouble(d);
		dos.writeBoolean(flag);
		dos.writeChar(c);
		
		//刷新
		dos.flush();
		dos.close();
	}
}
