package train.java.thread;

/**
 * 三个常用方法：
 * 		1. 获取当前线程Thread.currentThread();
 * 		2. 给线程起名字t.setName("");
 * 		3. 获取线程名字t.getName()
 *
 */
public class ThreadTest03 {
	public static void main(String[] args) {
		//获取当前线程对象
		Thread t = Thread.currentThread(); 	//t 保存的内存地址只想的线程是"主线程对象"
		//给线程起名
		t.setName("t-main");
		
		//获取线程名字
		System.out.println(t.getName()); //线程名字：main
		
		demo01 d1 = new demo01();
		Thread t1 = new Thread(d1);
		//给线程起名
		t1.setName("t1-Thread");
		t1.start();
		
		
		demo01 d2= new demo01();
		Thread t2 = new Thread(d2);
		//给线程起名
		t2.setName("t2-Thread");
		t2.start();
	}
}

class demo01 implements Runnable{
	public void run() {
		Thread t = Thread.currentThread();	//t 保存的内存地址只想的线程是"t1线程对象"
		System.out.println(t.getName()); //线程名字：Thread-0
	}
}