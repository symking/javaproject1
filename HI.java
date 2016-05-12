package urjita2;
import java.util.*;

public class HI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("First Hello World" );
		Date date = new Date();

		// display time and date using toString()
		System.out.println(date.toString());
		
		try { 
	         System.out.println(new Date( ) + "\n"); 
	         Thread.sleep(5*60*10); 
	         System.out.println(new Date( ) + "\n"); 
	      } catch (Exception e) { 
	          System.out.println("Got an exception!"); 
	      }
		}
	}
