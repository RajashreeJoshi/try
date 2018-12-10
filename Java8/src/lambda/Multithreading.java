package lambda;

public class Multithreading {
	
	public static void main(String[] args) {
		// It is NOT executed by new thread t. To have this we should call it using t.start(); Hence, run() method does not spawn new thread
		Thread t = new Thread(()->System.out.println("Hello"));
		System.out.println("Run Method is running by: "+ t.getName());
		t.run(); 
		
		//Using Thread Name
		Thread t1 = new Thread("Named thread"){
			public void run(){
				System.out.println("Run by: "+ getName());
			}
		};
		t1.start();
		System.out.println("Thread Name: "+ t1.getName());
		
		//Getting Current Thread
		Thread t2 = Thread.currentThread(); //returned reference to current thread executing currentThread()
		System.out.println("Current Thread Name: "+ t2.getName());
		
		//sample snippet
		System.out.println("Sample Snippet has started "+ Thread.currentThread().getName());
		
		for(int i=0;i<10;i++){
			new Thread(""+i){
				public void run(){
				System.out.println("Thread: " +Thread.currentThread().getName());
				}
			}.start();
		}
	}

}
