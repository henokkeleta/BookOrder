import java.util.Scanner;
import java.util.ArrayList;
public class BookApp {

	public static void main(String[] args) {
		/**
		 * The following Arraylist will serve for the following enevitable projects 
		 * that might envolve with the idea of book database
		 */
		ArrayList<Book> newBook=new ArrayList<Book>();
	   
		Book otherBook =new Book();
		otherBook.setAuthor("Henok Berhe");
		otherBook.setTitle("Coding Made easy");
		otherBook.setDescription("Computer Science book for dummies");
		otherBook.getDisplayText();
		newBook.add(otherBook);
		Book otherBook1 =new Book();
	otherBook1.setAuthor("Rediet Ayalew");
		otherBook1.setTitle("Coding Made easy");
	otherBook1.setDescription("Computer Science book for dummies");
		otherBook1.getDisplayText();
		
		
		

	}
	

}
