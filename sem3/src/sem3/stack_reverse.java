package sem3;

public class stack_reverse 
{
	  public stack s1,s2,s3;
	   
	   public stack_reverse(int x)
	   {
		   s1=new stack(x);
		   s2=new stack(x);
		   s3=new stack(x);
	   }
	   
	   
	   public void reverse(int a,int b)
	   {
		   while(!(s1.getTop()==a))
		   {
			   
			   s3.push(s1.pop());
			   
		   }
		   
		   s3.push(s1.pop());
		   
		   while(!(s3.getTop()==b))
		   {
			   
			   s2.push(s3.pop());
			   
		   }
		   
		   s2.push(s3.pop());
		
		   while(!(s2.isEmpty()))
			  s1.push(s2.pop());
		   
		   while(!(s3.isEmpty()))
			   s1.push(s3.pop());
		   
		   
		   
		   
		   
		   
	   }
	   
	   
}
