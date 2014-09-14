package exam;
import java.io.*;

public class Teacher 
{
	 Cards cards;
	 Teacher()throws IOException
	 {
		 cards=new Cards();
	 }
	 
	 
	 public Cards give_cards()
	 {
		 return  this.cards;
	 }
    	
	

}
