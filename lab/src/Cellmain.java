
import java.io.*;
public class Cellmain {
	public static void main(String args[])throws IOException
	{
		Cellgame m=new Cellgame();
	    m.getCellDetails();
	    m.assign();
	    for(int i=0;i<100;i++)
	    {
	    System.out.println("After step: "+ (i+1));
	    m.decide(m);
	    m.show();
	    System.out.println();
	    }
	  
	

}
	
}