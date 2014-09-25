import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Team01 
{
	public static void srchMoveList()
	{
		Scanner in = null;
		Scanner userIn = new Scanner(System.in); // I like to specify different scanners because I'm unlucky 
							   // when it comes to scanner errors.
		String userQ;
		Move move = null;
		
	    try 
	    {
	        in = new Scanner(new File("test.txt")); //contains move library
	    } catch (FileNotFoundException exception) {
	        throw new RuntimeException("failed to open data.txt");
	    }
	    
	    
	    
		System.out.println("Enter Move: ");
		userQ = userIn.next(); // User requested move
		
		while( in.next().equalsIgnoreCase(userQ) ) //looking for matching request
		{
			move = new Move(userQ);
			move.setName(in.next());
			move.setType(in.next());
			move.setDamage(in.next());
			move.setFrequency(in.next());
			move.setAccuracy(in.next());
			move.setRange(in.next());
			move.setFieldeffect(in.next());
			move.setDescription(in.next());
			move.setContest(in.next());
			
		
			
			//Display output with System.out.prinf(move.getX());
		}
		
	}
	
	public static void main( String args[])
	{
		
		while( true )
		{
			srchMoveList();
		}
		
	}
	
}
