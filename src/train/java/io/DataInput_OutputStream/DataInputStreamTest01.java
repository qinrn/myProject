package train.java.io.DataInput_OutputStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//数据字节输入流
public class DataInputStreamTest01 {

	public static void main(String[] args) throws IOException {
		// 1. 创建输入流
		DataInputStream dis = new DataInputStream(new FileInputStream("src/train/java/io/DataInput_OutputStream/temp05.txt"));
		//读
		//要用该留读取数据，必须提前知道该文件中数据的存储个是，顺序
		//读写顺序需要一致
		byte b = dis.readByte();
		short s = dis.readShort();
		int i = dis.readInt();
		long l = dis.readLong();
		float f = dis.readFloat();
		double d = dis.readDouble();
		boolean flag = dis.readBoolean();
		char c = dis.readChar();
		
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(flag);
		System.out.println(c);

	}

}
