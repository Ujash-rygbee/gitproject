package sem3;

public class Stack_elms_exchange
{
   public stack s1,s2,s3;
   
   public Stack_elms_exchange(int x)
   {
	   s1=new stack(x);
	   s2=new stack(x);
	   s3=new stack(x);
   }
   
   
   
   public void ExchangeElements(int a,int b)
   {
    boolean x=true;
	  while(x)
	  {
	   if(s1.getTop()==b)
	   { 
		   x=false;
		   s3.push(s1.pop());
	   }
	  
	   
	   else
		  s3.push(s1.pop());
	  
	  }
	  
	  x=true;
	  while(x)
	  {
		  if(s1.getTop()==a)
		   { 
			   x=false;
			   s2.push(s1.pop());
		   }
		  
		   
		   else
			  s2.push(s1.pop());
		   
	  }
	  
	  s1.push(s3.pop());
	  s3.push(s2.pop());
	  
	  while(!(s2.isEmpty()))
	  {
		  s1.push(s2.pop());
		  
	  }
	  
	  while(!(s3.isEmpty()))
	  {
		  s1.push(s3.pop());
	  }
	  
	  
	  s1.show();
	  //s2.show();
	  //s3.show();
	  
	  
	  
	  }
   
   
   
   
	
	
}
