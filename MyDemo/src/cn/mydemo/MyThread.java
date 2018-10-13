package cn.mydemo;

public class MyThread implements  Runnable {

	

	private int tickets =100;
	
	public void run() {
		// TODO Auto-generated method stub
		
		
		
		Long tid = Thread.currentThread().getId();
		String tname=Thread.currentThread().getName();
		
		
		while(true){
	

		
	
		if(tickets>0){
			
			
			String message="tid为"+tid+","+"tname为"+tname+"的线程正在出售第"+tickets+"张票。";
			System.out.println(message);
			tickets--;
		
			Thread.yield();
		}

	
	
		
		}
		
		
	}

}
