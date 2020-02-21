package train.java.io.BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterTest01 {

	public static void main(String[] args) throws IOException {
		// 创建输出流
		BufferedWriter bw = new BufferedWriter(new FileWriter("src/train/java/io/BufferedWriter/Bfile1"));
		String msg = "武汉加油！";
		bw.write(msg);
		
		//写入一个行分割符
	    bw.newLine();
	    //
	    bw.write("==》 加油加油！");
		
		//强制刷新
		bw.flush();
		//关闭流
		bw.close();
	}
}
