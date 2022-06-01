package demo;

public class ThreadDemo extends Thread {
	int num;
	String string;
	ThreadDemo(int num ,String string){
		this.num=num;
		this.string=string;
	}
	
	public void run() {
		
		int count =0;
		for(int i=0;i< num;i++) {
			count+=1;
			System.out.println(string+":"+count);
		}
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo object = new ThreadDemo(10,"lockdown-20");
		ThreadDemo object2 = new ThreadDemo(20,"covid-19");
		ThreadDemo object3 = new ThreadDemo(10,"vaccinated-21");
		object.start();
		object2.start();
		object3.start();
		
		
		
		

	}

}
