package lab3;
import java.util.Scanner;

public class insertion_sort 
{
  private int[] array=new int[5];
  Scanner scan=new Scanner(System.in); 
  
  
  
  public void sort()
  {
	  int k=0;
	  int l=0;
	  
	for(int i=0;i<5;i++)
	{
		int j=0;
		array[i]=scan.nextInt();
		System.out.println(array[i]);
		
		while(array[j]<array[i])
		{
		  j++;	
			
		}
	    
		System.out.println("j "+j);
		
		for(int m=j;m<i;m++)
		{
			
			array[m+1]=array[m];
			
			
		}
      
	  if(j>0)	
	  array[j-1]=array[i];
			
	
	for(int m=0;m<=i;m++)
	{
		System.out.println(array[m]);
	}

		
		
	}
	
	
	
	  
	  
	  
  }
  
  
	
	
}