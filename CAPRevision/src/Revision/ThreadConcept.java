package Revision;

class MyThread implements Runnable{
public static void main(String args[]) {
	
	
//	Thread thread = new Thread(MyThread);
	
	
//	Thread t = new Thread(MyThread);
//	t.start();
//	
	
	
	MyThread run = new MyThread(); 
	Thread t = new Thread(run); 
	t.start();
	
	
	
//	Thread thread = new Thread();
//	thread.run();
	
/*Missing code*/
}
public void run()
{}
}
