package exam;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Joe 
{
	
	Cards cards;
	ArrayList<String> words=new ArrayList<String>();
	ArrayList<String> words_that_can_be_formed=new ArrayList<String>();
	
	
	
	
	Joe()throws IOException
	{
		
		Scanner scan=new Scanner(new File("C:\\Users\\ujash\\Desktop\\Cards.txt"));
	    String z = null;
		while(scan.hasNext())
		{
			if(z==null)
			z=scan.next().trim();
                
	        else
			z=scan.next().trim();	
			
			words.add(z+"");
		}
	 }
	
	public void takeCards(Cards x)
	{
		this.cards=x;
		System.out.println(cards.words_of_cards);
	}
	
	
	public void store_words_that_can_be_formed()
	{
		
	}
	
	
	
	
	
	public void solve_problem1()
	{
		
	}
	
	public void solve_problem2()
	{
/*		for(int i=0;i<words.length-1;i++)
		{
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i].length()<words[j].length())
				{
					String e=words[i];
					words[i]=words[j];
					words[j]=e;
				}
			}
		}
		
	 int count=0;
	 int index=0;
	 ArrayList<String> z=Card.getWords_of_cards();
	 ArrayList<String> temp=new ArrayList<String>();
	 for(int i=0;i<words.length;i++)
	 {
		 for(int j=0;j<words[i].length();j++)
		 {
			 char o=words[i].charAt(j);
	           for(int k=0;k<z.size();k++)
			 {
				 String h=z.get(k);
				 char m=h.charAt(0);
				 
				  if(m==o)
				 {
					
	                count++;
	                z.remove(k);
	                temp.add(h);               
	           //     System.out.println(z);
	             //   System.out.println(temp);
	                break;
				}
				
		     }
			
		 }
		//System.out.println(count);
		 //System.out.println(words[i].length());
		
		if((z.size()+temp.size())-z.size()==count)
		{
			index=i;
			break;
		}
		count=0;
		for(int k=0;k<temp.size();k++)
		{
			z.add(temp.get(k));
		}
		temp.clear();
	 }
	 
	System.out.println(words[index]);	
*/

	}	
	
	
	
	

}
