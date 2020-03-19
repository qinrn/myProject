package train.java.thread;

/**
 *	面试题
 *
 */
public class ThreadTest06 {

	public static void main(String[] args) throws InterruptedException {
		//创建线程
		Thread t = new Processor03();
		//启动线程
		t.start();
		
		//休眠
//		Thread.sleep(5000);
		t.sleep(5000);  //等同于Thread.sleep(5000);阻塞的是当前线程，与t线程无关；
		
		System.out.println("helloworld");

	}

}

class Processor03 extends Thread{
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.println(Thread.currentThread().getName()+"====>" + i);
		}
	}
}
