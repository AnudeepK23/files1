
public class App {

	//main method represents main thread
	public static void main(String[] args) {
		//whatever we write in here will be executed by main thread
		//threads always execute the jobs in a sequence
		//Execution Context
		
		//Job1
		System.out.println("==> Application Started <==");
		
		
		for(int doc=0;doc<=10;doc++) {
			System.out.println("^^ Printing Document #" +doc+ "-Printer1");
		}
		
		
		//Job3
		
		System.out.println("==>Application Ended <==");

	}

}
