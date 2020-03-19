package train.java.thread;

/**
 *	线程优先级高的获取的cpu时间片多些
 *	优先级：1 ~ 10
 *	最低： 1
 *	最高：10
 *	默认：5
 *
 */
public class ThreadTest04 {
	public static void main(String[] args) {
		Thread t1 = new Processor01();
		t1.setName("t1");
		
		Thread t2 = new Processor01();
		t2.setName("t2");
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		//设置优先级
		t1.setPriority(1);
		t2.setPriority(10);
		
		//启动线程
		t1.start();
		t2.start();
	}
}

class Processor01 extends Thread {
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() + "===> " + i);
		}
	}
}
