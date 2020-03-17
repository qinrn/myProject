package train.java.thread;
/**
 * java语言中实现多线程的第一种方式： 继承Thread类
 * 		第一步： 继承java.lang.Thread;
 * 		第二步： 重写run方法
 * 
 * 三个重要知识点：
 * 		1. 如何定义线程？
 * 		2. 如何创建线程
 * 		3. 如何启动线程？
 */
public class ThreadTest01 {
	public static void main(String[] args) {
		// 创建线程
		Thread th = new Processor();
		//启动
		th.start(); // 这段代码执行瞬间节输，告诉JVM再分配一个新的栈给th线程，
					// run不需要程序员手动调用，系统线程启动之后自动调用run方法
//		th.run(); 	//这句代码只是普通方法调用，这样做程序只有一个线程，run方法结束之后，下面程序才能继续执行
		
		
		//这段代码在线程中运行
		for (int j = 1; j <= 10; j++) {
			System.out.println("main ===>" + j);
		}
		
		
		//有了多线程之后，main方法结束只是主线程栈中没有方法栈帧了
		//但是其他线程或者其他栈中还有栈帧
		//main方法节输，程序可能还在运行
	}
}
// 定义一个线程
class Processor extends Thread{
	//重写run方法
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("run =====>" + i);
		}
	}
} 



