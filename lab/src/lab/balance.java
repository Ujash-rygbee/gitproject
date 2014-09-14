package lab;
import java.util.Scanner;

public class balance {
     private stack stack1;
	 private Scanner scan;
	 private String a[];
	 private String e[];
	 
	 public void getInput()
	 {
		 scan=new Scanner(System.in);
		 String x=scan.nextLine();
		 int b=Integer.parseInt(x);
		 a=new String[b];
		 e=new String[b];
		 for(int i=0;i<b;i++)
		 {
			 a[i]=scan.nextLine();
			 e[i]="No";
		 }
	 }
	 
	 public void check()
	 {
		 char o;
		for(int i=0;i<a.length;i++)
		{
			stack1=new stack(a[i].length());
			for(int j=0;j<a[i].length();j++)
			{
				o=a[i].charAt(j);
				if(o=='{'||o=='['||o=='(')
					stack1.push(o);
					
				else if(o=='}')
				{
					if(stack1.top()=='{')
					stack1.pop();	
				}
				else if(o==']')
				{
					if(stack1.top()=='[')
					stack1.pop();	
				}
				
				else if(o==')')
				{
					if(stack1.top()=='(')
					stack1.pop();	
				}
			}
		
			if(stack1.isEmpty())
				e[i]="Yes";
	    }
		 
      }
	 
	   public void output()
	   {
		   
		   for(int i=0;i<a.length;i++)
		   {
			   System.out.println(a[i]+"       "+e[i].toUpperCase());
		   }
	 
	   }
}
