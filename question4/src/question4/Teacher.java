package question4;
import java.io.*;
import java.util.*;

public class Teacher 
{
  
	ArrayList<String> words=new ArrayList<String>();
    Teacher()throws IOException
    {
    	Scanner scan=new Scanner(new File("C:\\Users\\ujash\\Desktop\\Cards1.txt"));
    	while(scan.hasNext())
    	{
    		words.add(scan.next().trim());
    	}
    	
    	scan.close();
    	
    }
    
    public ArrayList<String> give_words()
    {
    	return this.words;
    }
     
	

}
