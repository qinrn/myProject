package train.java.thread;

/**
 * java中实现多线程的第二种方式： 实现Runnable接口
 * 		第一步： 写一个类实现java.lang.Runnable
 * 		第二步： 实现run方法
 *
 */
public class ThreadTest02 {

	public static void main(String[] args) {
		//创建线程
		Thread th = new Thread(new Process());
		//启动
		th.start();
	}
}

//这种方式是推荐的，因为一个类实现接口外保留了类的继承
class Process implements Runnable{

	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("run ===> " + i);
		}
	}

}
