package question4;
import java.io.*;
import java.util.*;


 public class kid
 {
	String sort[],storage1[],storage2[];
  ArrayList<String>words;
  ArrayList<String> Cards1;
  ArrayList<String> words_that_can_be_formed=new ArrayList<String>();
  ArrayList<String> temp=new ArrayList<String>();
  
 private int maxWords=0;
 private int maxSize=0;
  
  

   kid()throws IOException
   {
	   Scanner scan=new Scanner(new File("C:\\Users\\ujash\\Desktop\\Cards.txt"));
	   String z=scan.nextLine();
	   
	   Cards1=new ArrayList<String>();
	   
	   for(int i=0;i<z.length();i++)
	   {
		   Cards1.add(""+z.charAt(i));
	   }
	   scan.close();
	  }
   
   
   public void take_words(ArrayList<String> x)
   {
	   this.words=x;
	 
   }
   
 public void find_words_that_can_be_formed()
   {
	  
	   sort=new String[words.size()];
	    
	   for(int i=0;i<sort.length;i++)
	      sort[i]=words.get(i);
	   
	   words.clear();
	   
	   for(int i=0;i<sort.length-1;i++)
	   {
		  for(int j=i+1;j<sort.length;j++)
		  {
			  if(sort[i].length()>sort[j].length())
			  {
				  String e=sort[i];
				  sort[i]=sort[j];
				  sort[j]=e;
			  }
		  }
	   }
	   for(String x:sort)
	   words.add(x);
	   
	   System.out.println(words);
	   
	 }
 
 
   
   public void _solve_problem()
   {
	   ArrayList<String>_storer=new ArrayList<String>();
	   int count=0;
	   String a;
	   //for(int e=0;e<words.size();e++)
	   	   
	   
	   for(int i=0;i<words.size();i++)
	   {
		    a=words.get(i);
		  
		   
			   for(int j=0;j<a.length();j++)
			   {
				   String h=""+a.charAt(j);
				  inner: for(int k=0;k<Cards1.size();k++)
				   {
					   String m=Cards1.get(k);
					      if(m.equals(h))
						   {
							   Cards1.remove(m);
							   temp.add(m);
							   count++;
							   break inner;
							}
					   
					    }
			      }
			   System.out.println(Cards1);
				   if(count==a.length())
				   {
					   _storer.add(a);
					   System.out.println(a);
					   
				   }
				   
				   else if(count<a.length())
				   {
					   System.out.print(temp);
					   for(int j=0;j<temp.size();j++)
					   Cards1.add(temp.get(j));
				
					   temp.clear();
					   
					   System.out.print(temp);
				   }
				  count=0;
	        }
   }
   
   
   
   
   }
 

 
