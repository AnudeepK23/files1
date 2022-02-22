
//==>1
class Printer{
	//	synchronized void printDocuments(int numOfCopies, String docName) {
	 void printDocuments(int numOfCopies, String docName) {
		 for(int i=0; i<=numOfCopies;i++) {
			 try {
				 Thread.sleep(500);
			 } catch(InterruptedException e){
				 e.printStackTrace();
				 
			 }
			 
			System.out.println(">> Printing "+docName+" "+i);
		}
	}
}

class MyThread extends Thread{
	
	Printer pRef;
	
	MyThread(Printer p){
		pRef = p;
	}
	
	@Override
	public void run() {
		synchronized (pRef) {
		pRef.printDocuments(10,"VandanaProfile.pdf");
	}
	}
}

class YourThread extends Thread{
	
	Printer pRef;
	
	YourThread(Printer p){
		pRef = p;
	}
	
	@Override
	public void run() {
		synchronized (pRef) {
		pRef.printDocuments(10,"DivyaProfile.pdf");
	}
	}
}

public class MulThreading {
	
	//main method represents main thread
	public static void main(String[] args) {
		
		
		System.out.println("==> Application Started");
		
		//==>1
		//We have only 1 single object of Printer 
//		Printer printer = new Printer();
//		printer.printDocuments(10,"SwapnaProfile.pdf");
		
		
		//Scenario is that we have multiple thread working on the same Printer Object
		//If Multiple Threads are going to work on the same single Object must Synchronize them
		Printer printer = new Printer();
		MyThread mRef = new MyThread(printer);  	//MyThread is having reference to Print Object
		YourThread yRef = new YourThread(printer); 	//YourThread is having reference to Print Object
		mRef.start();
		yRef.start();
		
		
		System.out.println("==> Application Finished");

	}

}
