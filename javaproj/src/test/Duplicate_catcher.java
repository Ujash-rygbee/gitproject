package test;
import java.util.Scanner;

public class Duplicate_catcher 
{
   private String input;
  
  
  Duplicate_catcher(String s)
  {
	this.input=s;
	  
  }
  
  public String remove_Duplicates()
  {
	  String modified_input=new String();
	  int character_count[]=new int[26];
	  
	  for(int i=0;i<input.length();i++)
	  {
		char character=input.charAt(i);
		int integer=(int)character;
		
		if(integer>=97)
		
		{	
		  integer=integer-97;
		  
		}
		
		else
		{
			integer=integer-65;
			
		}
		
		character_count[integer]++;
		if(character_count[integer]<=1)
		{
			
			modified_input+=""+character;
			
		}
		  
		  
		  
	  }
	  
	  
	  
	  
	  return modified_input;
  }
  
   
  
	
	
	
	
}
