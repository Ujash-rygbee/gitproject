
public class main2 {

	public static void main(String[] args)
	
	{
		linkedlist link=new linkedlist();
		link.add(1);
		link.add(3);
		link.add(2);
		link.add(2);
		link.add(3);
		link.add(4);
		linkedfinder m=new linkedfinder(link);
		linkedlist newone=m.find(3);
		newone.show();
		System.out.println();
		link.show();
		
		
		

	}

}
