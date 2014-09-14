package exam;
import java.io.*;

public class q4main {

	public static void main(String[] args)throws IOException
	{
		
		Teacher teacher=new Teacher();
		Joe joe=new Joe();
		joe.takeCards(teacher.give_cards());
	}
	
}
