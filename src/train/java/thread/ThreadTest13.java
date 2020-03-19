package train.java.thread;

/**
 * t1 和 t2
 * 
 * 异步编程模型： t1线程执行t1的，t2线程执行t2的，两个线程之间谁也不等谁
 * 同步编程模型： t1，t2线程执行，当t1线程必须等t2线程执行结束后，t1线程才能执行，这是同步编程模型。
 * 
 * 什么时候要同步呢？为什么要引入线程同步呢？
 * 		1. 为了数据的安全。加入线程同步机制，使程序变成了（等同）单线程
 * 
 * 		2. 什么条件下要使用线程同步？
 * 			第一：必须是多线程环境
 * 			第二： 多线程环境共享同一个数据
 * 			第三： 共享的数据涉及到修改操作
 * 
 * 以下程序演示取款例子，以下程序使用线程同步机制，保证数据安全
 *
 */
public class ThreadTest13 {

	public static void main(String[] args) {
		//创建一个公共的账户
		Account act = new Account("actno - 001",5000.0) ;
		
		//创建线程对同一个账户取款
		Thread t1 = new Thread(new Processor13(act));
		Thread t2 = new Thread(new Processor13(act));
		
		t1.start();
		t2.start();
		
	}

}

//取款线程
class Processor13 implements Runnable{
	
	//账户
	Account act;
	
	Processor13(Account act){
		this.act = act;
	}
	
	public void run() {
		act.withdraw(1000.0);
		System.out.println("取款1000.0成功，余额：" + act.getBalance());
	}
}


//账户
class Account{
	private String actno ;
	private double balance;
	
	public Account() {
		
	}
	
	public Account(String actno, double balance){
		this.actno = actno;
		this.balance = balance;
	}

	public String getActno() {
		return actno;
	}

	public void setActno(String actno) {
		this.actno = actno;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//对外提供一个取款的方法
	public void withdraw (double money) {
		//把需要同步的代码，放到同步语句块中
		synchronized(this) {
			double after = balance - money;
			
			//延迟
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//更新
			this.setBalance(after);
		}
		
		
	}
}

