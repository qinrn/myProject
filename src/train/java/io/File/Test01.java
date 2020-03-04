package train.java.io.File;

import java.io.File;
import java.io.IOException;

public class Test01 {

	public static void main(String[] args) throws IOException {

		//path 相对路径
		File f1 = new File("src/train/java/io/File/Test01.java");
		
		File f2 = new File("D:\\workspace\\exercise\\myProject\\src\\train\\java\\io\\File");
		
		File f3 = new File("D:/workspace/exercise");
		
		System.out.println(f1.exists());
		System.out.println(f2.exists());
		System.out.println(f3.exists());
		
		File f4 = new File("D:/Test/test");
		System.out.println(f4.exists());
		File f5 = new File("D:/Test2/test/test.txt");
		
		if (!f4.exists()) {
			f4.mkdir();
			
		}
	}

}
