package exam;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Cards
{
	ArrayList<String> words_of_cards;
	
   Cards()throws IOException
   {
	Scanner scan=new Scanner(new File("C:\\Users\\ujash\\Desktop\\Cards.txt"));  
    String z=scan.nextLine();
    words_of_cards=new ArrayList<String>();
    
    for(int i=0;i<z.length();i++)
    {
     if(z.charAt(i)!=' ')	
     words_of_cards.add(""+z.charAt(i));
    }
   // System.out.println(words_of_cards);
    scan.close();
   
   }

public ArrayList<String> getWords_of_cards()
{
	return words_of_cards;
}


	
	



}
