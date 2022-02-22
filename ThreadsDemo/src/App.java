

//==>1
//class MyTask{
//	void executeTask() {
//		for(int doc=0;doc<=10;doc++) {
//			System.out.println("@@ Printing Document #" +doc+ "-Printer2");
//		}
//		
//	}
//}


//==> 2
//MyTask IS-A Thread
//class MyTask extends Thread{
//	@Override
//	public void run() {
//		for(int doc=0;doc<=10;doc++) {
//			System.out.println("@@ Printing Document #" +doc+ "-Printer2");
//		}
//		
//	}
//}


//==>3
class CA{
	
}

//class MyTask extends CA,Thread{ -->Error | Multiple Inheritance isn't supported in java
class MyTask extends CA implements Runnable{
	@Override
	public void run() {
		for(int doc=0;doc<=10;doc++) {
			System.out.println("@@ Printing Document #" +doc+ "-Printer2");
		}
		
	}
}

//==>4
class YourTask implements Runnable{
	@Override
	public void run() {
		for(int doc=0;doc<=10;doc++) {
			System.out.println("** Printing Document #" +doc+ "-Printer3");
		}
		
	}
}
public class App {

	//main method represents main thread
	public static void main(String[] args) {
		//whatever we write in here will be executed by main thread
				//threads always execute the jobs in a sequence
				//Execution Context
				
				//Job1
				System.out.println("==> Application Started <==");
				
				//Job2
				
				//==>1
//				MyTask task = new MyTask();
//				task.executeTask();
				
				//==>2
//				MyTask task = new MyTask(); // Child Thread / Worker Thread
//				task.start(); // --> Start shall internally execute run method
				
				//==>3
//				Runnable r = new MyTask();
//				Thread task = new Thread(r);
//				task.start();
				
				//Demon Thread
				Runnable r = new MyTask();
				Thread task = new Thread(r);
				task.setDaemon(true);
				task.start();
				
				
				//==>4
//				Thread yourTask = new Thread(new YourTask());
//				yourTask.start();
				
				//OR
				 new Thread(new YourTask()).start();
				
				
				//Till Job2 is not finished below written jobs are waiting and are not executed
				//In case Job2 is a long running operation, i.e several documents are suppose to be printed
				//In such use case OS/JVM shall give a message that app is not responding
				//Some sluggish behavior in app can be observed --> App seems to hang
				
				//==>2
				// Now, main and MyTask are executing both parallely or concurrently !!
				
				//Job3
				//Some Code to print the documents
				for(int doc=0;doc<=10;doc++) {
					System.out.println("^^ Printing Document #" +doc+ "-Printer1");
				}
				
				
				//Job4
				
				System.out.println("==>Application Ended <==");

	}

}
