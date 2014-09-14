import java.util.Scanner;
import java.io.*;
public class mainlline

{
  public static void main(String[] args)throws IOException
  {
	 binary_tree tree=new binary_tree();
	 Scanner scan=new Scanner(new File("C:\\Users\\ujash\\Desktop\\Employee.txt"));
	 int x=Integer.parseInt(scan.nextLine());
	 String a[]=new String[4];
	 int j=0;
	 
	 
	 while(j<x)
	 {
	   String z=scan.nextLine();
	   a=z.split(" ");
	  System.out.println(z);
	   
	   Employee employee=new Employee(a[0],Integer.parseInt(a[1]),Integer.parseInt(a[2]),Integer.parseInt(a[3]));
	   tree.insert(employee);
	   j++; 
	}
	 
	 scan=new Scanner(new File("C:\\Users\\ujash\\Desktop\\Data.txt"));
	 String r=scan.nextLine();
	 System.out.print(r);
	 x=Integer.parseInt(r);
	 
	  j=0;
	 
	 while(j<x)
	 {
		
	  String z=scan.nextLine();
	  
	  Scanner w=new Scanner(z);
	  int m=w.nextInt();
	  int n=w.nextInt();
	  tree.find(m, n);
	  j++;
	 w.close();
	 
	 }
	 System.out.println();
	 
	  scan.close();
	  tree.traverse();
  }
  
 

}
