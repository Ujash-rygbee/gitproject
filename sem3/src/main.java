import java.util.Scanner;


public class main
{

	public static void main(String[] args) throws Exception
	{
     
		linkedlist link=new linkedlist();
		link.add(1);
		link.add(2);
		link.add(3);
		link.add(4);
		link.show();
		link.delete(1);
		System.out.println();
		link.show();
		
	}

}
