package exam;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
	   int x;
	   Scanner scan=new Scanner(System.in);
	   x=scan.nextInt();
	   game Game=new game();
	   student Studs[]=new student[9];
	   
	  
	   int a[]=new int[9];
	   
	   
	   for(int i=0;i<Studs.length;i++)
	   {
		   a[i]=scan.nextInt();
		   Studs[i]=new student(i+1,a[i]);
	   }
	   
	   int max=0;
	   int min=20;
	   Mother mother=new Mother(Studs,x,Game);
	   for(int i=0;i<9;i++)
	   {
		   if(max<a[i])
			   max=a[i];
		   
		   if(min>a[i])
			   min=a[i];
	   }
	   
	    if(max-min==Studs.length-1)
		mother.find();
	   
	    else
	    mother.find1(0,Studs.length);
	    scan.close();
	    

	}

}
