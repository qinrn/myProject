package train.java.io.File;

import java.io.File;

public class Test02 {
	public static void main(String[] args) {
		
		// 1. 获取绝对路径
		File f1 = new File("temp00");
		
		String absolutePath = f1.getAbsolutePath();
		
		// 2. 获取文件名
		f1.getName();
		
		//3. 获取父路径
		f1.getParent();
		
	}
}
