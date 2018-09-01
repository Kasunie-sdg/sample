
package javaapplication2;


class EvenGen extends Thread   {
         @Override
 	public void run() {
		System.out.println("\nThe EvenGen thread started!");
		System.out.println("\nEvenGen Thread Prints Even Numbers:");
    		for (int i =1; i<=10; i++)
				System.out.print(i% 2 == 0 ? i + " " : "");
	   	}
  }



public class ThreadDemo1 {
	public static void main(String[] args) {
    	System.out.println("Constructing the EvenGen Thread...");
   			EvenGen ev = new EvenGen();
    			System.out.println("Starting the EvenGen thread from main ...");
   			ev.start();
    			System.out.println("Now in the main Thread!");
				System.out.println("main Thread Prints Odd Numbers:");
   					for (int i =1; i<=10; i++)
						System.out.print( (i % 2 != 0 ) ? i + " ": "");
        }
}
